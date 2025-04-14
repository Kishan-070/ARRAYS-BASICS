//finding Maximum and Minimum element in an Array.

import java.util.Arrays;

// Approach 1 --> Using Arrays module [Arrays.stream(arr).max() ]
public class MaxMinUsingArraysModule {
    public static void main(String[] args){
        int[] myArr =  {12,58,64,91,52,45,10,30,22,32,23};
        int max = Arrays.stream(myArr).max().getAsInt();
        int min = Arrays.stream(myArr).min().getAsInt();
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
    }

}
