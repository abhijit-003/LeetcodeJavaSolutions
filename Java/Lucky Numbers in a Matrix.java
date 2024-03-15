//1380 Lucky Numbers in a Matrix
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            int min=Integer.MAX_VALUE;
            int col = 0;
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]<min)
                {
                    min = matrix[i][j];
                    col = j;
                }
            }
            int max = Integer.MIN_VALUE;
            for(int k=0;k<m;k++)
            {
                if(matrix[k][col]>max)
                {
                    max = matrix[k][col];
                    if(max>min)
                        break;
                }
            }
            if(min==max)
                list.add(max);
        }
        return list;
    }
}
