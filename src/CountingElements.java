
//Program to find the occurrence of an element in an array .

import java.util.Scanner;

public class CountingElements {

    public static int occurrence(int[] arr, int Target){
        int count = 0;

        for (int i =0;i<arr.length;i++){
            if(arr[i] == Target){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] myArr = {12,25,65,25,10,29,25,63,25};

        int index = 0;
        while(index <myArr.length){
            System.out.println(myArr[index]);
            index++;
        }

        System.out.print("Enter The number to count its occurring in an Array: ");
        int Element = input.nextInt();

        System.out.println("The number of occurrence of Element "+Element+" in the Array is : "+occurrence(myArr,Element));

    }
}
