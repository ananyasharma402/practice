public class Arraysmallest{
  
    public static void main(String args[]){

    int [] arr= {4,6,2,7,0};
    int n= arr.length;
    int small=arr[0] ;
  
    for(int i=0; i< n; i++){
        
        if (arr[i] < small){
            small=arr[i];
        }
     }

     System.out.println(small);
    }
}