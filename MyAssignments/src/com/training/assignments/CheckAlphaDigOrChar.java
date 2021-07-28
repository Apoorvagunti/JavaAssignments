package com.training.assignments;

public class CheckAlphaDigOrChar {
    public static void main(String[] args){
        char c1='h';
        if((c1>=48 && c1<=57) || c1 == 45)
        {
            System.out.print("char is Digit");

        }
        else if((c1>='a' && c1<='z')||(c1>='A' && c1<='Z'))
        {
            System.out.print("char is Alphabet");
        }
        else
        {
            System.out.print("char is special character");

        }
    }
}
