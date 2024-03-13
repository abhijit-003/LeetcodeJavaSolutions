//791

class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : order.toCharArray()) {
            charCount.put(c, 0);
        }
        
        for (char c : s.toCharArray()) {
            if (charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            }
        }
        
        StringBuilder sortedS = new StringBuilder();
        for (char c : order.toCharArray()) {
            for (int i = 0; i < charCount.get(c); i++) {
                sortedS.append(c);
            }
        }
        
        for (char c : s.toCharArray()) {
            if (!charCount.containsKey(c)) {
                sortedS.append(c);
            }
        }
        
        return sortedS.toString();
    }
}
