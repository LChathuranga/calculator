package com.kelaniya.uni;

import java.util.ArrayList;

public class MultipleNumbers {
    private int mul;

    public MultipleNumbers(ArrayList<Integer> num){
        mul = num.get(0) * num.get(1);
    }

    public int getMul(){
        return mul;
    }
    public void setMul(int mul){
        this.mul = mul;
    }
}
