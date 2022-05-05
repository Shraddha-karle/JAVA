package com.company;

public class isSorted {
     public static boolean isSorted(int arr[]) {
         for (int i = 0; i < arr.length; i++);
         int i = 0;
         for (int j = i + 1; j < arr.length; j++)
                 if (arr[j] < arr[i])
                     return false;
                 return true;

         }
         public static void main(String[] args) {
        int arr[]={23,34,44,49,65,67};
        System.out.println(isSorted(arr));
    }
}
