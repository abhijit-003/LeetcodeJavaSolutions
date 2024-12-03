//2109. Adding Spaces to a String
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuffer sb = new StringBuffer();
        int j = 0;
        int ind = 0;
        int len = spaces.length;
        for (int i = 0; i < s.length(); i++) {
            if (ind < len && i == spaces[ind]) {
                sb.append(" ");
                ind++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
