package com.company;

import javax.swing.*;
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of row of first matrix ");
        int r1= sc.nextInt();
        System.out.println("Enter the number of columns of first matrix");
        int c1=sc.nextInt();
        System.out.println("Enter the number of row of second matrix");
        int r2=sc.nextInt();
        System.out.println("Enter the number of columns of second matrix");
        int c2=sc.nextInt();
        if(r1==r2 && c1==c2){
            int a[][]=new int[r1][c1];
            int b[][]=new int[r2][c2];
            int c[][]=new int[r2][c2];
            System.out.println("Enter the elements for first matrix ");
            for (int i=0;i<r1;i++){
                for (int j=0;j<c1;j++){
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("Enter the elements for second matrix ");
            for (int i=0;i<r2;i++){
                for (int j=0;j<c2;j++){
                    b[i][j]=sc.nextInt();
                }
            }
            System.out.println("First matrix ");
            for (int i=0;i<r1;i++){
                for (int j=0;j<c1;j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Second matrix ");
            for (int i=0;i<r2;i++){
                for (int j=0;j<c2;j++){
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();
            }

            for (int i=0;i<r1;i++){
                for (int j=0;j<c2;j++){
                    for (int k=0;j<c1;k++){
                        c[i][j]=a[i][j]+b[i][j];
                    }
                }
            }
            System.out.println("Addition of both the matrix is :- ");
            for (int i=0;i<r1;i++){
                for (int j=0;j<c2;i++){
                    System.out.print(c[i][j]+" ");
                }
            }
        }
        else{
            System.out.println("Cannot be added ");
        }
    }
}
