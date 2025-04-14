import java.util.Arrays;

public class Reverse {
    public static  void is_reverse(int[] arr) {
        int start =  0;
        int end = arr.length-1;
        while (start <end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("The Reversed Array is: "+Arrays.toString(arr));



    }

    public static void main(String[] args) {
        int[] myArr = ArrayUtility.inputArray();
        System.out.println("The Array is :"+ Arrays.toString(myArr));
        is_reverse(myArr);


    }
}

