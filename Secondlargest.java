public class Secondlargest {
    public static void main(String args[]){
        int [] arr = {1,4,6,3,2};
        int n = arr.length;
        int largest=arr[0];
        int secondlargest =0;
        
        for(int i=0; i<n; i++){
            if( arr[i] >  largest){
                largest = arr[i];
                secondlargest = largest;

            }
            else if (secondlargest > arr[i] && secondlargest != largest){
                secondlargest = arr[i];
            }
        }
        System.out.println(secondlargest);
    }
}
