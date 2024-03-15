//2605 Form Smallest Number From Two Digit Arrays
import java.util.*;
class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    return nums1[i];
            }
        }
        }
        int small = 0;
        for(int k=1;k<nums1.length;k++){
            if(nums1[small]>nums1[k]){
                small = k;
            }
        }
        
        int small1 = 0;
        for(int l=1;l<nums2.length;l++){
            if(nums2[small1]>nums2[l]){
                small1 = l;
            }
        }
        String val = String.valueOf(nums1[small])+String.valueOf(nums2[small1]);
        int last = Integer.parseInt(val);

        String val1 = String.valueOf(nums2[small1])+String.valueOf(nums1[small]);
        int last1 = Integer.parseInt(val1);
        if(last>last1){
            return last1;
        }
        return last;
    }
}
