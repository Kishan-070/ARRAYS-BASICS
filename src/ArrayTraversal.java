//creating Array , taking values from user for Array ,  and Traversal of Array.


import java.util.Scanner;

public class ArrayTraversal {
    public static void  main(String[] args){
        Scanner input  = new Scanner(System.in);

        //Taking size of an Array.

        System.out.print("Enter the size of an Array: ");
        int size = input.nextInt();

        // Initializing Array for the given size.
        int[] myArr = new int[size];

        //Taking input form user
        System.out.println("Enter Elements: ");
        for (int i =0;i<size;i++){
            System.out.print("Element "+(i+1)+": ");
            myArr[i]= input.nextInt();
        }

        // Traversing
        int index = 0;
        System.out.println("Elements Entered are: ");
        while(index < myArr.length){
            System.out.println(myArr[index]);
            index++;
        }

        input.close();
    }
}
