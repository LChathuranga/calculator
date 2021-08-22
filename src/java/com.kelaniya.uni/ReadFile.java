package com.kelaniya.uni;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    private ArrayList<Integer> list = new ArrayList<>();

    public ReadFile(){

        File file = new File("C:\\Users\\User\\Desktop\\Software construction\\calculator\\read.txt");

        try{
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextInt()){
                list.add(scanner.nextInt());
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public ArrayList<Integer> getList(){
        return list;
    }
    public void setList(ArrayList<Integer> list){
        this.list = list;
    }
}
