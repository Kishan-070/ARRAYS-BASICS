// Reverse an Array using another array.

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] myArr = ArrayUtility.inputArray();
        int[] newArr = new int[myArr.length];
        System.out.println("The Array is: "+Arrays.toString(myArr));

        int j = 0;  //This j track the index of newArr
        // copy element form myArr and past it in newArr
        for (int i = myArr.length-1 ; i>=0 ; i--){
            newArr[j] = myArr[i];
            j++;
        }
        System.out.println("The reversed Array is : "+Arrays.toString(newArr));



    }
}
