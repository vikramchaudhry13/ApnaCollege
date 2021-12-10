package com.apnacollege;
import java.util.Scanner ;
public class MiniProject {
    public static void main(String []args){
        //MiniProject
        Scanner sc=new Scanner(System .in);
        int mynumber=(int)(Math.random() *100);
        int userNumber=0;
        do {
            System.out.println("guess any number(1-100):");
            userNumber = sc.nextInt();
            if (userNumber == mynumber) {
                System.out.println("whoo...correct number");
                break;
            } else if (userNumber > mynumber) {
                System.out.println("your number is too large");
            } else {
                System.out.println("your number is too small");
            }
        }
            while (userNumber >=0);
                System.out.println("my number was:");
                System.out.println(mynumber);
    }
}
