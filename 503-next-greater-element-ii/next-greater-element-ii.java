class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> a = new Stack<>();
        int[] nxtGreater = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            nxtGreater[i] = -1;
        }
        for (int i = 2 * nums.length - 1; i >= 0; i--) {
            int circularIndex = i % nums.length;
            while (!a.isEmpty() && nums[a.peek()] <= nums[circularIndex]) {
                a.pop();
            }
            if (!a.isEmpty()) {
                nxtGreater[circularIndex] = nums[a.peek()];
            }
            a.push(circularIndex);
        }
        return nxtGreater;
    }
}
