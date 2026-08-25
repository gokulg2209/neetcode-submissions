class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result= new ArrayList<>();
        findCombination(0,nums,target,result,new ArrayList<>());
        return result; 
    }

    public void findCombination(int ind,int[] nums, int target, List<List<Integer>> result, List<Integer> ds){
        if(ind == nums.length){
            if(target == 0){
                result.add(new ArrayList<>(ds));
            }
            return;
        }

        if(nums[ind] <= target){
            ds.add(nums[ind]);
            findCombination(ind,nums,target-nums[ind],result,ds);
            ds.remove(ds.size()-1);
        }

        findCombination(ind+1,nums,target,result,ds);
    }
}
