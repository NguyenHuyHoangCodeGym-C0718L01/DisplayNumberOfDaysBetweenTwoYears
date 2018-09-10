package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first year: ");
        int year1 = scanner.nextInt();

        System.out.print("Input the second year: ");
        int year2 = scanner.nextInt();

        int sum = 0;
        for(int i = year1; i <= year2; i++){
            sum += numberOfDaysInAYear(i);
        }

        System.out.println("Number of days between 2 years is: " + sum);
    }

    public static int numberOfDaysInAYear(int year){
        boolean isLeapYear = false;

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            return 366;
        } else {
            return 365;
        }
    }
}
