//1921 Eliminate Maximum Number of Monsters
class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        double[] time_to_city = new double[dist.length];
        for (int i = 0; i < dist.length; i++) {
            time_to_city[i] = (double)dist[i] / speed[i];
        }
        Arrays.sort(time_to_city);
        for (int i = 0; i < dist.length; i++) {
            if (time_to_city[i] <= i) {
                return i;
            }
        }
        return dist.length;
    }
}
