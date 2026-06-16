class Solution {
    public boolean hasDuplicate(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
               if(nums[i] == nums[j])
                count++;
            }
            if(count>1)
                return true;
            count=0;
        }
        return false;
    }
}