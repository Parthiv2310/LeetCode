class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        for(int i = len - 1; i >= 0; i--){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            } else {
                return (i + 3) / 3;
            }
        }
        return 0;
    }
}