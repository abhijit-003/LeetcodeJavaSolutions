//3136. Valid Word

class Solution {
    public boolean isValid(String word) {

        int vowelCount = 0;
        int consonantCount = 0;
        Set<Character> hs = Set.of('a', 'e', 'i', 'o', 'u');

        if (word.length() < 3)
            return false;

        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));

            //checks english letter 
            if (Character.isLetter(ch)) {
                if (hs.contains(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }

            //checks if not digit then it is special symboll return false
            } else if (!Character.isDigit(ch)) {
                return false;
            }
        }
        if (vowelCount <= 0 || consonantCount <= 0)
            return false;
        return true;
    }
}
