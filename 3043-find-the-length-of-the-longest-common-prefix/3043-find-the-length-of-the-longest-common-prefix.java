class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        // int n=arr1.length;
        // int m=arr2.length;

        Set<Integer>set=new HashSet<>();
        
        for(int nums:arr1){
            int n=nums;
            // String last="";
            while(n>0){
                set.add(n);
                n/=10;
            }
        }
        int res=0;
        int cnt=0;
        for(int nums:arr2){
            int n=nums;
            while(n>0){
                
            if(set.contains(n)){
                String s=String.valueOf(n);
                cnt=s.length();
                res=Math.max(res,cnt);
                break;
            }
                n/=10;
            }
        }
        return res;
    }
}