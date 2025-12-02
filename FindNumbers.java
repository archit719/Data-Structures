class Solution {
    public int findNumbers(int[] nums) {
        // Counter to count the number of even digit integers
        int evenDigitCount = 0;

        for (int num : nums) {
            // Convert num to string and find its length
            int digitCount = (int) Math.floor(Math.log10(num)) +1;
            if (digitCount % 2 == 0)
                evenDigitCount++;
        }
        return evenDigitCount;
    }
}
