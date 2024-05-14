class Solution {
    public int[][] largestLocal(int[][] grid) 
    {
        int len = grid.length;
        int [][]maxLocal = new int[len-2][len-2];
        int i,j;
        // System.out.println("the array size is "+len);
        for (i=0;i<len-2;i++)
        {
            for(j=0;j<len-2;j++)
            {
                maxLocal[i][j]= findMax(grid,i,j);
            }
        }
         return maxLocal;   
    }
    public int findMax(int [][] grid,int i,int j)
    {
        int x,y,temp=0;
        for(x=i;x<i+3;x++)
        {
            for(y=j;y<j+3;y++)
            {
                if ((grid[x][y])>temp)
                temp = grid[x][y];
            } 
        }
        return temp;
    }
}


// class Solution {
//     public int[][] largestLocal(int[][] grid) {
//         int len = grid.length;
//         int[][] maxLocal = new int[len - 2][len - 2];

//         for (int i = 0; i < len - 2; i++) 
//         {
//             for (int j = 0; j < len - 2; j++)
//             {
//                 maxLocal[i][j] = findMax(grid, i, j);
//             }
//         }
//         return maxLocal;
//     }

//     public int findMax(int[][] grid, int i, int j) {
//         int max = Integer.MIN_VALUE;

//         // Iterate over the 3x3 sub-matrix
//         for (int x = i; x < i + 3; x++) {
//             for (int y = j; y < j + 3; y++) {
//                 if (grid[x][y] > max) {
//                     max = grid[x][y];
//                 }
//             }
//         }
//         return max;
//     }
// }
