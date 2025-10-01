package Day5.Day6;

public class SpiralMatrix{
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        
        int startRow=0,endRow=matrix.length-1;
        int startCol=0, endCol=matrix[0].length-1;
        while(startCol<=endCol && startRow<=endRow){
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }

            //right
            for(int j=startRow+1; j<=endRow; j++){
                System.out.print(matrix[j][endCol]+" ");
            }

            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }

            //left
            for(int j=endRow-1; j>=startRow+1; j--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[j][startCol]+" ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
}