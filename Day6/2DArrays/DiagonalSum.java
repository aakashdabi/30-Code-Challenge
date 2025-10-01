package Day5.Day6;


public class DiagonalSum {
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int sum=0;
        //brute force approach
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }else if(i+j==matrix.length-1){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // } 


        for(int i=0; i<matrix.length; i++){
            //primary diagonal
            sum+=matrix[i][i];
            //secondery diagonal
            if(i!=matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        System.out.println(sum);
    }
}
