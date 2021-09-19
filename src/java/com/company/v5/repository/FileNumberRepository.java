package com.company.v5.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository implements NumberRepository {

    public Double[] getNumbers() throws IOException {

        List<String> numbers = Files.readAllLines(Paths.get("C:\\Users\\Lahir\\OneDrive\\Desktop\\Software Construction\\calculator\\read1.txt"));

        double number1 = Double.parseDouble(numbers.get(0));
        double number2 = Double.parseDouble(numbers.get(1));

        return new Double[]{ number1, number2 };

    }

}
