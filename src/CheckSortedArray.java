//check whether the given array is sorted or not.

public class CheckSortedArray {

    public static boolean is_Increasing(int[] arr){
    int i = 1;
    while (i < arr.length){
        if(arr[i] < arr[i-1]){
            return false;
        }
        i++;
    }
    return true;

    }
    public static boolean is_Decreasing(int[] arr){
        int i = 1;
        while (i < arr.length){
            if(arr[i] > arr[i-1]){
                return false;
            }
            i++;
        }
        return true;

    }

    public static void main(String[] args) {
        int[] myArr = ArrayUtility.inputArray();
        System.out.println("The Element in the Arrays are: ");
        for (int j : myArr) {
            System.out.println(j);
        }
        if (is_Increasing(myArr) || is_Decreasing(myArr)){
            System.out.println("The Array is  Sorted");
        }
        else {
            System.out.println("The array is not sorted");
        }
    }
}
