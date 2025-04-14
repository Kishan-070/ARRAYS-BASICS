import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        int[] myArr = new int[size];
        System.out.println("Enter the element into the Array: ");
        int index = 0;
        while(index <myArr.length){
            System.out.print("Enter Element"+(index+1)+" :");
            myArr[index] = input.nextInt();
            index ++;
        }
        return myArr;
    }
}
