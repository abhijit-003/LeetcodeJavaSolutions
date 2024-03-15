//268 Missing Number
class Solution {
    public int missingNumber(int[] nums) {
        
        //1st approach
        // for(int i=0;i<nums.length;i++){ 
        //     boolean flag = false;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[j] == i)
        //             flag = true;
        //     }
        //     if(!flag)
        //         return i;
        // }

        //2nd approach
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=i)
        //         return i;
        // }
        // return nums.length;
        
        //3rd approach(more efficient)
        
        int n = nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        return ((n*(n+1)/2) - sum);
  }
}
