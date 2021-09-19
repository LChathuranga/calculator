package com.company.v5.operations;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DivOperationTest {

    @Test
    public void should_divide_positive_values() throws InvalidOperationExeption {
       DivOperation divOperation = new DivOperation();
        Double result = divOperation.execute(new Double[]{15.0, 3.0});

        assertThat(result, is(5.0));
    }

}