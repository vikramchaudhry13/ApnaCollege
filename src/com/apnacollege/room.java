package com.apnacollege;

class room {
    float   ln;
    float br;
    void getdata(float a,float b){
        ln=a;
        br=b;
    }
}
class roomarea{
    public static void main(String args[]){
        float  area;
        room room1=new room() ;
        room1 .getdata(14,10) ;
        area =room1 .ln *room1 .br ;
        System.out.println("area="+area );
    }
}