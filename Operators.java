package com.company;

public class Operators {
    public static void main(String[] args) {
        int m=2;
        int n=3;
        int p=4;
        //Unary Operators
        System.out.println("Unary Operators");

        System.out.println(m++);
        System.out.println(++m);
        System.out.println(m--);
        System.out.println(--m);

        //Arithematic Operators
        System.out.println("Arithematic operators");
        System.out.println(m+n);
        System.out.println(p-m);
        System.out.println(m*n);
        System.out.println(p/m);
        System.out.println(p/m);
        System.out.println(m==n);

        //Assignment Operators
        System.out.println("Assignment operators");
        System.out.println(m+=n);
        System.out.println(p-=n);
        System.out.println(n*=p);
        System.out.println(m/=p);

        //Relational Operators
        System.out.println("Relational Operators ");
        System.out.println(m>n);
        System.out.println(m<n);
        System.out.println(m<=n);
        System.out.println(m>=n);
        System.out.println(m!=n);

    }
}
