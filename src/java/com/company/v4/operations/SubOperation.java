package com.company.v4.operations;

import com.company.v4.Operation;

public class SubOperation implements Operation {

    public Double execute(Double[] numbers) {

        return numbers[0] - numbers[1];

    }

}
