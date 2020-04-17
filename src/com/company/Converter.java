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
//          From EU to DK
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
//          From DK To EU
            case "12":
                grade = "A";
                break;

            case "10":
                grade = "B";
                break;

            case "7":
                grade = "C";
                break;

            case "4":
                grade = "D";
                break;

            case "02":
                grade = "E";
                break;

            case "00":
                grade = "Fx";
                break;

            case "-3":
                grade = "F";
                break;
        }
        return grade;
    }
}
