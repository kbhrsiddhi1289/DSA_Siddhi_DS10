
import java.util.*;

class Solution {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word;
    }

    private TrieNode root;

    public List<String> findWords(char[][] board, String[] words) {
        root = new TrieNode();

        // Build Trie
        for (String word : words) {
            TrieNode node = root;

            for (char c : word.toCharArray()) {
                int idx = c - 'a';

                if (node.children[idx] == null) {
                    node.children[idx] = new TrieNode();
                }

                node = node.children[idx];
            }

            node.word = word;
        }

        List<String> result = new ArrayList<>();
        int m = board.length;
        int n = board[0].length;

        // Start DFS from every cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(board, i, j, root, result);
            }
        }

        return result;
    }

    private void dfs(char[][] board, int row, int col,
                     TrieNode node, List<String> result) {
        char c = board[row][col];

        if (c == '#' || node.children[c - 'a'] == null) {
            return;
        }

        node = node.children[c - 'a'];

        // Word found
        if (node.word != null) {
            result.add(node.word);
            node.word = null; // Avoid duplicates
        }

        // Mark cell visited
        board[row][col] = '#';

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int k = 0; k < 4; k++) {
            int nr = row + dr[k];
            int nc = col + dc[k];

            if (nr >= 0 && nr < board.length &&
                nc >= 0 && nc < board[0].length) {
                dfs(board, nr, nc, node, result);
            }
        }

        // Restore cell
        board[row][col] = c;
    }
}
