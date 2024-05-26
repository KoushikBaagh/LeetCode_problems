class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int len = nums.length;

        // Iterate through the array, trying to remove one element at a time
        for (int i = 0; i < len; i++) {
            // Create a new array with one element removed
            int[] newArray = new int[len - 1];
            System.arraycopy(nums, 0, newArray, 0, i); // Copy elements before index i
            System.arraycopy(nums, i + 1, newArray, i, len - i - 1); // Copy elements after index i

            // Check if the new array is strictly increasing
            if (isStrictlyIncreasing(newArray)) {
                return true;
            }
        }

        return false;
    }

    // Helper function to check if an array is strictly increasing
    boolean isStrictlyIncreasing(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
