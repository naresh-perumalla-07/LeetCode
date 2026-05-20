class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int n=A.length;

        int common[]=new int[n+1];
        int cnt=0;
        int res[]=new int[n];

        for(int i=0;i<n;i++){

            common[A[i]]++;
            if(common[A[i]]==2)cnt++;
            common[B[i]]++;
            if(common[B[i]]==2)cnt++;
            res[i]=cnt;


        }
        return res;
    }
}