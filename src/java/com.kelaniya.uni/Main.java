package com.kelaniya.uni;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name;

       do {

           System.out.println("Do you want to : \n\tAdd two numbers \t : type \"add\"\n\tSubtract two numbers : " +
                   "type \"sub\"\n\tMultiply two numbers : type \"mul\"");

           Scanner scanner = new Scanner(System.in);
           name = scanner.nextLine();

           Coordinator cd = new Coordinator(name);
       }
       while (!name.equals("exit"));
       System.exit(0);
    }
}
