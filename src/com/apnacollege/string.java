package com.apnacollege;

class string {
    public static void main(String args[]) {
        String name = new  String("aman");
        System.out.println(name.charAt(0));
        String name1=new String("karan");
        String description=new String(" is a good boy");
        String sentence=name1 + description ;
        System.out.println(sentence );
        String name2=new String("vikram");
        System.out.println(name2.length());
        String name3=new String("Chaudhry");
        System.out.println(name3.replace('a','b'));
        String name4=new String("alluarjun");
        System.out.println(name4.substring(0,4));
    }
}
