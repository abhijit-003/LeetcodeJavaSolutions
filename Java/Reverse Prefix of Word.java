//2000. Reverse Prefix of Word
class Solution {
    String reverse(char arr[],int end){
        int start = 0;
        while(start<=end){
            char ch = arr[start];
            arr[start] = arr[end];
            arr[end] = ch;
            start++;
            end--;
        }
        return String.valueOf(arr);
    }
    public String reversePrefix(String word, char ch) {
        char wordArray[] = word.toCharArray();
        for(int i=0;i<wordArray.length;i++){
            if(wordArray[i] == ch){
                return reverse(wordArray,i);
            }
        }
        return String.valueOf(wordArray);
    }
}
