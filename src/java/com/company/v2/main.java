package com.company.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument !");
            return;
        }

        String operator = args[0];

        if (!(operator.equals("sub") || operator.equals("mul") || operator.equals("add"))) {
            System.out.println("please add, mul, or sub as a operator");
            return;
        }

        List<String> numbers = Files.readAllLines(Paths.get("C:\\Users\\User\\Desktop\\Software construction\\calculator\\read1.txt"));

        double number1 = Double.parseDouble(numbers.get(0));
        double number2 = Double.parseDouble(numbers.get(1));

        double result = 0;
        if (operator.equals("add")) {
            result = number1 + number2;
        } else if (operator.equals("sub")) {
            result = number1 - number2;
        } else {
            result = number1 * number2;
        }

        System.out.println(result);
    }
}
