package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Converter {
    public String grade = "";
    ArrayList<String> gradesDK = new ArrayList<String>(Arrays.asList("-3", "00", "02", "4", "7", "10", "12"));
    ArrayList<String> gradesEU = new ArrayList<String>(Arrays.asList("F", "Fx", "E", "D", "C", "B", "A"));

    //  Starts checkinf for input form the user
    public void start() {
        // Get input from the user
        System.out.println("Pleaser enter the grade that you want to convert");
        Scanner scn = new Scanner(System.in);
        // Call the method and print the result
        System.out.println(convert(scn.next()));
    }

    public String convert(String input) {
        switch (input) {
//          From EU to DK
            case "A": case "a":
                grade = "12";
                break;

            case "B": case "b":
                grade = "10";
                break;

            case "C": case "c":
                grade = "7";
                break;

            case "D": case "d":
                grade = "4";
                break;

            case "E": case "e":
                grade = "02";
                break;

            case "Fx": case "fX": case "FX": case "fx":
                grade = "00";
                break;

            case "F":case "f":
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

            default:
                grade = "Error";
                break;
        }
        System.out.println(grade);
        return grade;
    }
}
