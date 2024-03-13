class Solution {
    private static int sum(int start, int end) {
        int n = (end - start) + 1;
        return n * (start + end) / 2;
    }

    public int pivotInteger(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int sum1 = sum(1, mid);
            int sum2 = sum(mid, n);
            if (sum1 == sum2)
                return mid;
            else if (sum1 < sum2)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}