class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            max=Math.max(max,num);
        }
        int n=nums.length;

        int ans=0;

        for(int num:nums){
            ans+=max-num;
        }
        return ans;

        // int cnt=1;
        // while(n<cnt){
        //     for(int i=0;i<n;i++){
        //         if(nums[i]==max){
        //             cnt++;
        //             continue;
        //         }else{
        //             nums[i]++;
        //             ans++;
                   
        //         }
        //     }
        // }
        // return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna