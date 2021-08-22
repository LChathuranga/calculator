package com.company.v1.v2;

public class main {
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("Please provide the operation as an argument !");
            return;
        }


        String operator = args[0];

        if(!(operator.equals("sub") || operator.equals("mul") || operator.equals("add"))){
            System.out.println("please add, mul, or sub as a operator");
            return;
        }

        System.out.println(args[0]);



    }
}
