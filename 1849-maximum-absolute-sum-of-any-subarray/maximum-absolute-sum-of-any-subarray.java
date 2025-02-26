class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = 0; // The maximum sum of subarrays
        int min = 0; // The minimum sum of subarrays
        int res = 0;

        for (int num : nums) {
            max += num;
            min += num;
            max = Math.max(max, 0);
            min = Math.min(min, 0);

            res = Math.max(res, max);
            res = Math.max(res, -min);
        }

        return res;
    }
}