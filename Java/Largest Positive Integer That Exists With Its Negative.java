//2441. Largest Positive Integer That Exists With Its Negative
class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int maxK = Integer.MIN_VALUE;
        for (int num : nums) {
            if (hs.contains(-1 * num))
                maxK = Math.max(maxK,Math.abs(num));
            hs.add(num);
        }
        return maxK == Integer.MIN_VALUE? -1: maxK;
    }
}
