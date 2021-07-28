package com.training.assignments;

public class CheckCmdArg {
    public static void main(String[] args){


            int length = args.length;
            if(length==0) {
                System.out.println("No values");
            }
            else {
                System.out.print(args[0]);
                for(int i=1;i<length;i++){
                    System.out.print(","+ args[i]);
                }

        }
    }

}
