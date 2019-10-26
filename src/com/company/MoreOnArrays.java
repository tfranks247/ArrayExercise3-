package com.company;

public class MoreOnArrays {
    public static void main (String [] args){
        System.out.println("Index\tValue");
        int tony[] = {5,34,23,55,12};

        for(int counter =0; counter <tony.length; counter++){
            System.out.println(counter + "\t" + tony[counter]);
        }
    }
}
