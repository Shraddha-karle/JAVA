package com.company;

public class decreasingtriangle {
    public static void main(String[] args) {
        int n=10;
        for (int i=1;i<=10;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
