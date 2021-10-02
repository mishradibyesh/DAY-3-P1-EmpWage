import java.util.*;
import java.lang.*;
public class EmpWageComputation {
static final int Fulltime=1;
static final int  Parttime=2;
        public static void main(String[] args) {
                        System.out.println("Welcome to EMPLOYEE WAGE COMPUTAION PROGRAM");
                        int TotalMonthlySalary=0;
                        for(int i=1; i<=20;i++) {
                        int Random=(int)Math.floor(Math.random()*10)%3; //creating random
                        int salary=0;
                        switch (Random)   // checking presence with the help of if condition
                        {	
                        case Fulltime:
                        
                    	     int FullDayHour=8;
                             int WagePerHour=20;
                    	     salary+=WagePerHour*FullDayHour;
                             System.out.println("Employee is full time and his day "+i+" income is Rs. "+salary);
                             break;
                        case Parttime:
                             int FullDayHour1=4;
                             int WagePerHour1=20;
                             salary+=WagePerHour1*FullDayHour1; 
                             System.out.println("Employee is part time and his day "+i+" income is Rs. "+salary);
                             break;
 
                        default : 
                   	      System.out.println("Employee is absent and his day "+i+" income is Rs. 0");
                        } 
                             //  calculating the total monthly income
                              TotalMonthlySalary+=salary;
                        }
                              System.out.println("Employee's monthly salary is Rs. "+TotalMonthlySalary);
   
           }
       }
