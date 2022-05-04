package com.company;

public class Wrapper {
    public static void main(String[] args) {
        //int i=100;
        //Integer iob=Integer.valueOf(i);
        //Integer iobj1=i;
        //System.out.print
        Integer iobj=new Integer(100);
        int i=iobj.intValue();
        int j=iobj;
        System.out.println(iobj);
    }
}

