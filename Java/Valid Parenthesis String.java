//Valid Parenthesis String
class Solution {
        public boolean checkValidString(String s) {
        int openMin = 0, openMax = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == '(') {
                openMax++;
                openMin++;
            } else if (c == ')') {
                openMax--;
                openMin--;
            } else if(c=='*'){
                openMax++;
                openMin--;
            }
            if (openMax < 0) return false;
            openMin = Math.max(openMin,0);
        }
        return openMin == 0;
    }
}
