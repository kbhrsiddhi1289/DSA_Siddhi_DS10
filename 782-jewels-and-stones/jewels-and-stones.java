class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // Create a set to store jewel characters for quick lookup
        Set<Character> jewelSet = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            jewelSet.add(c);
        }
        
        // Count how many stones are jewels
        int count = 0;
        for (char s : stones.toCharArray()) {
            if (jewelSet.contains(s)) {
                count++;
            }
        }
        
        return count;
    }
}