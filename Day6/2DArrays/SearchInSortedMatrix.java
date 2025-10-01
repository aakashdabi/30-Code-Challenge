
public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,4},
            {5,6,7,8},
            {8,10,11,12},
            {13,14,15,16}
        };

        int n=9;
        int row=0;
        int col=matrix[0].length-1;

        while (row<matrix.length && col>=0) {
            if(n==matrix[row][col]){
                System.out.println("Find at: "+row+","+col);
                break;
            }else if(n<matrix[row][col]){
                col--;
            }else if(n>matrix[row][col]){
                row++;
            }
        }
       
    }
}
