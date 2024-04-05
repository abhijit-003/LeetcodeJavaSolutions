//1544. Make The String Great
class Solution {
    public String makeGood(String s) {
        int endPtr = 0;
        char arr[] = s.toCharArray();
        for (int currPtr = 0; currPtr < s.length(); currPtr++) {
            if (endPtr > 0 && Math.abs(arr[currPtr] - arr[endPtr - 1]) == 32)
                endPtr--;
            else {
                arr[endPtr] = arr[currPtr];
                endPtr++;
            }
        }
        return new String(arr).substring(0, endPtr);
    }
}
