//  Max min  in Arrays

public class Max_min {

    public static int find_Max(int[] arr){
        int max = arr[0];
        for (int i = 0;i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int find_Min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] Array = ArrayUtility.inputArray();
        System.out.println("The Elements  are: ");
        int i = 0;
        while (i<Array.length){
            System.out.println(Array[i]);
            i++;
        }
        System.out.println("max:"+find_Max(Array));
        System.out.println("max:"+find_Min(Array));
    }
}
