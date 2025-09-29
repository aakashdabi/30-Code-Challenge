package Day4.Day4.Sorting;

public class CountingSort {
    public static void main(String[] args) {
      int arr[]={3,9,6,2,1,8,7,4,5,3,1};
       int max=Integer.MIN_VALUE;

       for(int i=0; i<arr.length; i++){
        max=Math.max(max, arr[i]);
       }
       int count[]= new int[max+1];

        for(int i=0; i<arr.length; i++){
        count[arr[i]]++;
       }
       int j=0;
       for(int i=0; i<count.length; i++){
        while(count[i]>0){
            arr[j++]=i;
            count[i]--;
        }
       }
       for(int i=0; i<arr.length; i++){
        System.out.print(arr[i]+" ");
       }  
    }
}
