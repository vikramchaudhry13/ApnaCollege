package com.apnacollege;

public class ExceptionHandling {
    public static void main(String args[]){
        int []marks={98,97,95};
        try {
            System.out.println(marks [4]);
        }
        catch (Exception exception ){
            System.out.println("An exception for caught while accessing an index the 'marks' array");
        }
        System.out.println("we tried to print marks & an exception must have occurred with index >=3");
    }
}
