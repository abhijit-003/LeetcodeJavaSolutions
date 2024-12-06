// 2554. Maximum Number of Integers to Choose From a Range I
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int numCount = 0;
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : banned) {
            set.add(num);
        }
        for (int i = 1; i <= n; i++) {
            if (set.contains(i)) {
                continue;
            }
            sum += i;
            if (sum > maxSum) {
                return numCount;
            }
            numCount++;
        }
        return numCount;
    }
}
