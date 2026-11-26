class Solution {
    public boolean canAliceWin(int n) {
        int remove = 10;
        boolean aTurn = true;
        while (remove > 0 && n >= remove) {
            n -= remove;
            remove--;
            aTurn = !aTurn;
        }
        return !aTurn;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna