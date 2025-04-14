//Sum and Average of all element in an Array.

public class SumAndAverage {
    // Sum of all element in an array
    public static int sum(int[] arr) {
        int index = 0;
        int add = 0;

        while (index < arr.length) {
            add = add + arr[index];
            index++;
        }

        return add;
    }


//Average of all element in an Array.
    public static void Average(int[] arr){
        float Avg  = (float)sum(arr)/ arr.length;
        System.out.print("The Average of the Element in the array is :"+Avg);

    }


    public static void main(String[] args) {
        int[] myarr = {12,58,64,32,52,45,10,30,62,32,23};
        for (int i = 0;i<myarr.length;i++){
            System.out.println(myarr[i] );
        }
        System.out.println("The sum of the Element in the array  is: "+sum(myarr));

        Average(myarr);
    }
}
