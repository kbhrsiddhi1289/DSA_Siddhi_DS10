import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals by starting point
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> merged = new ArrayList<>();

        // Step 2: Traverse each interval
        for (int[] interval : intervals) {
            // If list is empty or no overlap
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // Overlapping intervals, merge by extending the end
                merged.get(merged.size() - 1)[1] = Math.max(
                    merged.get(merged.size() - 1)[1],
                    interval[1]
                );
            }
        }

        // Step 3: Convert list to array
        return merged.toArray(new int[merged.size()][]);
    }
}