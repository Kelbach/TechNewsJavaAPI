package com.technews;

public class VariablesPractice {
    public static void main(String[] args) {
        int var1 = 5;
        double var2 = 2;
        double sum = var1 + var2; //double var?

        String string1 = "Why though?";
        String string2 = string1 + sum;

        System.out.println(string2); //had to choose correct printIn
        //expected: Why Though?9
        //result: Why Though?7.0
        //I guess double is a decimal
    }
}
