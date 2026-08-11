class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;

        boolean[] hashTable = new boolean[1276];

        int sequentialSum = nums[0];


        for(int i = 0; i < n; i++){
            hashTable[nums[i]] = true;
        }

     
        for(int i = 1;
            i < n && nums[i] == nums[i - 1] + 1;
            sequentialSum += nums[i++]);

        
        while(hashTable[sequentialSum])
            sequentialSum++;
            

        return sequentialSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna