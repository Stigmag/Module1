package com.nix.module1;

import java.util.Arrays;

public class UniqNumber {
    public int uniq(int[] arr) {

        int result = 0;
        for (int i = 0; i < arr.length/2; i++) {
 for(int j=arr.length/2;j<arr.length;j++)
         if(arr[i]!=arr[j])
                result+=1;


        }return result;
    }
}
