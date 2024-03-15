//1759 Count Number of Homogenous Substrings
class Solution {
    public int countHomogenous(String s) {
        int ans = 0;
        int l = 0;
        int mod = 1000000007; // 10^9 + 7
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) l += 1;
            else l = 1;
            ans = (ans + l) % mod;
        }

        return ans;
    }
}
