public class Checksort {
    public static void main(String args[]){
        int [] arr = {1,6,7,4,0};
        int i=0 ;
        int j= i+1; 
        int n = arr.length;

        for(i=0; i<n; i++){
            if(arr[i] > arr[j]){
                System.out.println("sorted asc");
            }
            else{
                System.out.println("unsorted");
            }
        }
    }
}
