//Minimum Number of Arrows to Burst Balloons

class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        Arrays.sort(points, (a, b) -> Long.compare(a[0], b[0]));
        
        long end = points[0][1];
        int arrows = 1;

        for (int i = 1; i < n; i++) {
            if (points[i][0] > end) {
                arrows++;
                end = points[i][1];
            } else {
                end = Math.min(end, points[i][1]);
            }
        }
        return arrows;
    }
}
