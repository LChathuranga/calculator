package com.kelaniya.uni;

import java.util.ArrayList;

public class Coordinator {
    public Coordinator(String name){
        ReadFile read = new ReadFile();

        ArrayList<Integer> numbers = read.getList();

        if (name.equals("add")){
            AddNumbers add = new AddNumbers(numbers);

            System.out.println(add.getAdd());
        }
        else if (name.equals("sub")){
            SubstractNumbers sub = new SubstractNumbers(numbers);

            System.out.println(sub.getSub());
        }
        else if (name.equals("mul")){
            MultipleNumbers mul = new MultipleNumbers(numbers);

            System.out.println(mul.getMul());
        }
    }
}
