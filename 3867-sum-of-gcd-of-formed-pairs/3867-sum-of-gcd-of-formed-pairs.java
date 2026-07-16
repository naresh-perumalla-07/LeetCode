class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int[]preG=new int[n];

        long ans=0;

        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            preG[i]=gcd(nums[i],max);
        }
        Arrays.sort(preG);

        for(int i=0;i<n/2;i++){
            ans+=gcd(preG[i],preG[n-i-1]);
        }
        return ans;
    }

    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna