package com.company;

public class If_else_if_ladder {
    public static void main(String[] args) {
        int marks=35;
        if(marks>=90){
            System.out.println("You secured A grade");
        }
        else if(marks>=80){
            System.out.println("You secured B grade");
        }
        else if(marks>=70){
            System.out.println("You secured C grade");
        }
        else if(marks>=50){
            System.out.println("You secured D grade");
        }
        else{
            System.out.println("You are Failed");
        }
    }
}
