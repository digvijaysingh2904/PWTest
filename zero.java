class Solution {
    public static void main(String args[]) {
        int nonZeroIndex = 0;
        int nums[] = new int[10] ; 

        // Move non-zero elements to the beginning of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // Assign remaining elements as 0 from nonZeroIndex to end of array
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}
