package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(AgeTemperature(15,13));
        System.out.println(AgeTemperature(9,34));
        System.out.println(AgeTemperature(46,15));
        System.out.println(AgeTemperature(48,34));
        System.out.println(AgeTemperature(32,0));
    }
    public static String AgeTemperature ( int age, int temperature) {
if ((age >= 20 && age <= 45 && temperature>= -20 && temperature< 30 ) ||
        (age<20 && temperature>= 0 && temperature<= 28) ||
        (age>45 && temperature >= -10 && temperature<= 25))
    return "можно идти гулять";
else{
        return "оставайся дома";
    }
}}