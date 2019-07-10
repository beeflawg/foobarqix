package com.example.demo;

public class FooBarQix implements IFooBarQix {

    public int startingNumber = 0;
    public String result = "";
    public String strNum = String.valueOf(startingNumber);


    public FooBarQix()
    {
        this.startingNumber = startingNumber;
        this.strNum = String.valueOf(startingNumber);
        this.result = result;

    }


    public String calculate(int startingNumber){

        strNum = String.valueOf(startingNumber);

        if(startingNumber % 3 == 0){
            result+="Foo";
        } if(startingNumber % 5 == 0){
            result+="Bar";
        } if(startingNumber % 7 == 0){
            result+="Qix";
        }

        for (int i =0; i < strNum.length(); i++){
            char ch = strNum.charAt(i);
            if (ch == '0'){
                result+= "*";
            }
            if (ch == '3'){
                result+="Foo";
            } if (ch == '5'){
                result += "Bar";
            } if (ch == '7'){
                result += "Qix";
            }
        }
        return result;

    }



}
