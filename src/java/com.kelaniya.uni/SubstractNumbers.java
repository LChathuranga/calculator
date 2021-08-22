package com.kelaniya.uni;

import java.util.ArrayList;

public class SubstractNumbers{
    private int sub;

    public SubstractNumbers(ArrayList<Integer> num){
        if (num.get(0) >= num.get(1)){
            sub = num.get(0) - num.get(1);
        }
        else
            sub = num.get(1) - num.get(0);
    }
    public int getSub(){
        return sub;
    }
    public void setSub(int sub){
        this.sub = sub;
    }
}
