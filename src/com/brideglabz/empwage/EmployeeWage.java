package com.brideglabz.empwage;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_TIME_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_FULL_TIME = 2 ;
    static final int IS_PART_TIME = 1;

    public static void main(String[] args) {
        System.out.println("Employee Wage Problem");
        int dailyWage = 0;
        int empCheck = (int)Math.floor(Math.random()*10)%3;
        switch (empCheck){
            case IS_FULL_TIME:
                System.out.println("Employee FULL TIME");
                dailyWage = WAGE_PER_HOUR * FULL_TIME_HOUR;
                break;
            case IS_PART_TIME:
                System.out.println("Employee PART TIME");
                dailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                break;
            default:
                System.out.println("Employee Absent");
        }
        System.out.println("Daily Wage => "+dailyWage);
    }

}
/*Solving using
Switch Case
Statement*/
