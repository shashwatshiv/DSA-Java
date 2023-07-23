public class pairInArray {
 public static void main(String[] args){
     int[] arr = {1,2,3,4,5,6};
     pair(arr);
 }

     static void pair(int[] arr) {

     // for loop to choose first element of pair
         for (int i = 0; i < arr.length; i++) {
             // for loop to choose second element of array
             for (int j = i+1; j < arr.length; j++) {
                 System.out.print(arr[i] +" "+ arr[j]+" ,  ");
             }
             System.out.println();
         }
    }
}
