//1760. Minimum Limit of Balls in a Bag
class Solution {
    private boolean canDivide(int[] nums, int maxBalls, int maxOperations) {
        int operations = 0;
        for (int n : nums) {
            operations += (n + maxBalls - 1) / maxBalls - 1;
            if (operations > maxOperations) return false;
        }
        return true;
    }
    
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = Arrays.stream(nums).max().getAsInt();
        int maxPenalty = right;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canDivide(nums, mid, maxOperations)) {
                right = mid;
                maxPenalty = right;
            } else {
                left = mid + 1;
            }
        }
        return maxPenalty;
    }
}
