package com.training.assignments;

import java.util.Scanner;

public class ChangeCase {
    public static void main (String[] args)
    {

        System.out.println("Enter the character to change the case");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);

        char b;
        if(Character.isLowerCase(a))
            b= Character.toUpperCase(a);
        else
            b= Character.toLowerCase(a);
        System.out.println(a+"->"+b);

    }
}
