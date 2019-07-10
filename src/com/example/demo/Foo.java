package com.example.demo;

public class Foo implements IFooBarQix {
    public int startingNumber = 0;
    public String result = "";
    public String strNum = String.valueOf(startingNumber);

    public Foo()
    {
        this.startingNumber = startingNumber;
        this.strNum = String.valueOf(startingNumber);
        this.result = result;

    }

    @Override
    public String calculate(int startingNumber){

        strNum = String.valueOf(startingNumber);

         if(startingNumber % 3 == 0){
            result+="Foo";
        }

        for (int i =0; i < strNum.length(); i++){
            char ch = strNum.charAt(i);

            if (ch == '3'){
                result+="Foo";
            }
        }

        return result;
    }

}
