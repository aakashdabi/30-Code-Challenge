public class Transpose {
    public static void main(String args[]){
        int[][] matrix={
            {11,12,13},
            {22,33,44}
        };
        printMatrix(matrix);
        int n=matrix[0].length;
        int m=matrix.length;
        int tranMatrix[][]=new int[n][m];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                tranMatrix[j][i]=matrix[i][j];
            }
        }
        printMatrix(tranMatrix);
        
    }
    public static void printMatrix(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
       for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        } 
    }
}
