package com.company.v4;

import com.company.v4.operations.AddOperation;
import com.company.v4.operations.MulOperation;
import com.company.v4.operations.SubOperation;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {

        CommandLineInputs commandLineInputs = new CommandLineInputs( args );
        String operator = commandLineInputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();

        Operation operation = null;

        if (operator.equals("add")) {

            operation = new AddOperation();

        } else if (operator.equals("sub")) {

            operation = new SubOperation();

        } else {

            operation = new MulOperation();

        }
        Double result = operation.execute(numbers);
        System.out.println(result);
    }
}
