package com.example.demo;

public class Qix implements IFooBarQix {
    public int startingNumber = 0;
    public String result = "";
    public String strNum = String.valueOf(startingNumber);

    public Qix()
    {
        this.startingNumber = startingNumber;
        this.strNum = String.valueOf(startingNumber);
        this.result = result;

    }

    public String calculate(int startingNumber){

        strNum = String.valueOf(startingNumber);

        if(startingNumber % 7 == 0){
            result+="Qix";
        }

        for (int i =0; i < strNum.length(); i++){
            char ch = strNum.charAt(i);

            if (ch == '7'){
                result+="Qix";
            }
        }

        return result;
    }

}
