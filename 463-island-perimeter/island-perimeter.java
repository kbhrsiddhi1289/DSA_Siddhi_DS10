class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    // Start with 4 sides for each land cell
                    perimeter += 4;

                    // Subtract sides shared with upper cell
                    if (i > 0 && grid[i - 1][j] == 1) perimeter -= 2;

                    // Subtract sides shared with left cell
                    if (j > 0 && grid[i][j - 1] == 1) perimeter -= 2;
                }
            }
        }

        return perimeter;
    }
}