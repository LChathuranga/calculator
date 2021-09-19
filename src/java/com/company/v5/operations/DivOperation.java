package com.company.v5.operations;

import java.awt.dnd.InvalidDnDOperationException;

public class DivOperation implements Operation {

    public Double execute(Double[] numbers) throws InvalidOperationExeption {

        if (numbers[1] == 0.0){
            throw new InvalidOperationExeption(" Do not divide zero");
        }
        return numbers[0] / numbers[1];

    }

}
