package com.kelaniya.uni;

import java.util.ArrayList;

public class AddNumbers {
    private int add;

    public AddNumbers(ArrayList<Integer> num){
        add = num.get(0) + num.get(1);
    }

    public int getAdd(){
        return add;
    }

    public void setAdd(int add){
        this.add = add;
    }
}
