package com.company;

import java.util.Scanner;

public class Converter {

    String grade = "";

//  Starts checkinf for input form the user
    public void start(){
        System.out.println("Pleaser enter the grade that you want to convert");
        Scanner scn = new Scanner(System.in);
        convert(scn.next());

    }

    public String convert(String input){
        switch (input) {
            case "A":
                grade = "12";
            break;

            case "B":
                grade = "10";
            break;

            case "C":
                grade = "7";
            break;

            case "D":
                grade = "4";
            break;

            case "E":
                grade = "02";
            break;

            case "Fx":
                grade = "00";
            break;

            case "F":
                grade = "-3";
            break;

        }
        System.out.println(grade);
        return grade;
    }
}
