public class Transpose {

    static void swap(int matrix[][], int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp; 
    }

    static void transpose(int matrix [][], int n){
        for(int i=0; i<n ;i++){
            for(int j=0; j<i ; j++){
                swap(matrix,i,j);
            }
        }
    }
}
