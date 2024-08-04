/**
 * Searching
 */
public class Searching {

    public static void main(String[] args) {
        int arr[]={1,8,2,6,9,5};
       int target=9;
      int a= linarSearch(arr, target);
      System.out.println(a);

    }

 //1) write the code for linearSearch
 public static int linarSearch(int arr[],int target){
    if(arr.length==0) return -1;
    for(int index=0;index<arr.length;index++){
        if(arr[index]==target){
            return index;
        }
    }
    return -1;
}
//2) write the code for linearSearch using for-each loop
public void linearSearchUsingForEachLoop(int arr[],int target){
    if(arr.length==0) System.out.println(target+"Element is not present in the array "); 
    for(int element: arr){
        if(element==target){
            System.out.println(element+"is present in the array");
        }
    }
    

}
//3) write the code for linearSearch in 2D array
public void linearSearchIn2DArray(int arr[][], int target) {
    if (arr.length == 0) {
        System.out.println(target + " is not present in the array");
        return;
    }

    boolean found = false;
    for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            if (arr[row][col] == target) {
                System.out.println(target + " is present in the array at index "+row+" "+col);
                found = true;
                break; 
            }
        }
        if (found) {
            break; 
        }
    }
    if (!found) {
        System.out.println(target + " is not present in the array");
    }
}
}