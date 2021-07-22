package com.company;
import java.util.*;

class Calculate{
    float principalAmount = 0;
    float numberOfYears = 0;
    float rateOfInterest = 0;
    void getValues(float principalAmount, float numberOfYears, float rateOfInterest){
        this.principalAmount = principalAmount;
        this. numberOfYears = numberOfYears;
        this. rateOfInterest = rateOfInterest;
    }
}

class Simple_Interest extends Calculate{
    float Simple_Interest_Value = 0;
    void Simple(){
        Simple_Interest_Value = (principalAmount*numberOfYears*rateOfInterest)/100;
    }
}
class CompoundInterest extends Simple_Interest{
    float n = 12;
    float CompoundValue = 0;
    void Compound(){
        CompoundValue =  principalAmount * ((float)Math.pow((1 + rateOfInterest / 100), numberOfYears)) - principalAmount;
    }
}

class Display extends CompoundInterest{
    void Display(){
        System.out.println("**********************");
        System.out.println("Principal Amount: "+ (int)principalAmount);
        System.out.println("NO of years: "+ (int)numberOfYears);
        System.out.println("Rate of interest: "+ (int)rateOfInterest);
        System.out.println("Simple Interest: "+ Simple_Interest_Value);
        System.out.println("**********************");
        System.out.println("Principal Amount: "+ (int)principalAmount);
        System.out.println("NO of years: "+ (int)numberOfYears);
        System.out.println("Rate of interest: "+ (int)rateOfInterest);
        System.out.println("Compound Interest: "+ String.format("%.2f",CompoundValue));
        System.out.println("Difference of CI and SI "+ String.format("%.2f",(CompoundValue -Simple_Interest_Value)));
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        float principal = Sc.nextFloat();
        float numberOfYears = Sc.nextFloat();
        float rateOfInterest = Sc.nextFloat();
        Display ob = new Display();
        ob.getValues(principal, numberOfYears,rateOfInterest);
        ob.Simple();
        ob.Compound();
        ob.Display();
    }
}
