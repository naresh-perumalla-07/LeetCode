class Solution {
    public int numOfSubarrays(int[] arr) {
        int odd = 0;
        int parity = 0;

        for (int num : arr) {
            odd += (parity ^= (num & 1));
        }

        long even = arr.length - odd + 1;
        return (int) ((odd * even) % 1_000_000_007);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna