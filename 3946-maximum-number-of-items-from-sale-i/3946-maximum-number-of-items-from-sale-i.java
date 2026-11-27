class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;

        int[] dp = new int[budget + 1];
        int min = Integer.MAX_VALUE;

        for(int[] item : items){
            min = Math.min(min, item[1]);
        }

        for(int i = 0; i < n; i++){
            int fact = items[i][0];
            int price = items[i][1];
             int free = 0;

            for(int j = 0; j < n; j++){
                if(i != j && items[j][0] % fact == 0){
                    free++;
                }
            }

            int val = free + 1;

            for(int j = budget; j >= price; j--){
                dp[j] = Math.max(dp[j], dp[j - price] + val);
            }
        }

        int ans = 0;

        for(int i = 0; i <= budget; i++){
            int total = dp[i] + (budget - i) / min;
            ans = Math.max(ans, total);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna