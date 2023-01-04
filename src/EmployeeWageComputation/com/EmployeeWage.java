package EmployeeWageComputation.com;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("-------Welcome to the Employee Wage problem-------");
        int empCheck = (int)Math.floor(Math.random()*10)%2;
        if (empCheck == 1)
            System.out.println("Employee Present");
        else
            System.out.println("Employee Absent");
    }
}
/*Check Employee is
Present or Absent
- Use ((RANDOM)) for Attendance
Check*/
