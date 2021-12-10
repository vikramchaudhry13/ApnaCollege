package com.apnacollege;
import java.util.Scanner ;
public class TakingInput {
    public static void main(String args[]){
        Scanner sc=new Scanner(System .in );
        int n=sc .nextInt() ;
        float f=sc .nextFloat() ;
        String name= sc.next();
        String line= sc.nextLine();
        System.out.println(n);
        System.out.println(f);
        System.out.println(name );
        System.out.println(line );
    }
}
