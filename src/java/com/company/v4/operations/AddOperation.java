package com.company.v4.operations;

public class AddOperation implements Operation {

    public Double execute(Double[] numbers) {

        return numbers[0] + numbers[1];

    }

}
