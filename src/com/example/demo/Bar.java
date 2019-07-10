package com.example.demo;

public class Bar implements IFooBarQix {
    public int startingNumber = 0;
    public String result = "";
    public String strNum = String.valueOf(startingNumber);

    public Bar()
    {
        this.startingNumber = startingNumber;
        this.strNum = String.valueOf(startingNumber);
        this.result = result;

    }

    public String calculate(int startingNumber){

        strNum = String.valueOf(startingNumber);

        if(startingNumber % 5 == 0){
            result+="Bar";
        }

        for (int i =0; i < strNum.length(); i++){
            char ch = strNum.charAt(i);

            if (ch == '5'){
                result+="Bar";
            }
        }

        return result;
    }

}
