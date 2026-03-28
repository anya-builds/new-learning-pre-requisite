package com.Ankita.res;

public class Main {
    public static void main(String[] args) {
        /*
        Syntax of if statement
        if(boolean exp)
{
//body}
else{
//do this
        * */
        int salary = 25400;
//        if(salary>10000){
//            salary=salary+2000;
//        }else {
//            salary=salary+1000;
//        }
        if(salary>10000){
            salary+=2000;
        }else if(salary>20000){
            salary+=3000;
        }else {
            salary+=1000;
        }
        System.out.println(salary);
    }
}
