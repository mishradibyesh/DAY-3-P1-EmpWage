import java.util.*;
import java.lang.*;
public class EmpWageComputation {
static final int Fulltime=1;
static final int  Parttime=2;
        public static void main(String[] args) {
                        System.out.println("Welcome to EMPLOYEE WAGE COMPUTAION PROGRAM");
                        int Random=(int)Math.floor(Math.random()*10)%3; //creating random
                        int salary=0;
                        if(Random==Fulltime)   // checking presence with the help of if condition
                        {	
                    	     int FullDayHour=8;
                             int WagePerHour=20;
                    	     salary+=WagePerHour*FullDayHour;
                             System.out.println("Employee is full time and his today's income is Rs. "+salary);
                        }
                        // checking if employee is part time
                        else if(Random==Parttime) {
                              int FullDayHour1=4;
                              int WagePerHour1=20;
                       	      salary+=WagePerHour1*FullDayHour1; 
                              System.out.println("Employee is part time and his today's income is Rs. "+salary);

                         }
                        
                         else if (Random==0) { 
                              System.out.println("Employee is absent and his today's income is Rs. 0");
                         }
                }
        }

