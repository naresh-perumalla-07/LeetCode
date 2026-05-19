class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        int n=nums1.length;

        int m=nums2.length;

      

        int i=0;int j=0;

        while(i<n && j<m){
            if(nums1[i]<nums2[j])i++;
            else if(nums2[j]==nums1[i]){
                return nums1[i];

             }else j++;
        }

        return -1;
    }
}
    //     for(int nums:nums1){

    //         int a=nums;

    //         for(int num:nums2){
    //             if(num==a){
    //                 cnt++;
    //                 break;
    //             }
    //         }

    //     }
    //     return cnt;
    // }
