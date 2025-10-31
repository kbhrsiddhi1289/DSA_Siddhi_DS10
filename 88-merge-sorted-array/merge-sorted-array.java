class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;  // Pointer for the last element of the first array
        int j = n - 1;  // Pointer for the last element of the second array
        int k = m + n - 1;  // Pointer for the last position in nums1

        // Start from the end and move backward to merge arrays
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // If there are remaining elements in nums2, add them to nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}