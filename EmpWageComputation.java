import java.util.*;
import java.lang.*;
public class UC_4 {
static final int Fulltime=1;
static final int  Parttime=2;
        public static void main(String[] args) {
                        System.out.println("Welcome to EMPLOYEE WAGE COMPUTAION PROGRAM");
                        int Random=(int)Math.floor(Math.random()*10)%3; //creating random
                        int salary=0;
                        switch (Random)   // checking presence with the help of if condition
                        {	
                        case Fulltime:
                        
                    	     int FullDayHour=8;
                             int WagePerHour=20;
                    	     salary+=WagePerHour*FullDayHour;
                             System.out.println("Employee is full time and his today's income is Rs. "+salary);
                             break;
                        case Parttime:
                             int FullDayHour1=4;
                             int WagePerHour1=20;
                             salary+=WagePerHour1*FullDayHour1; 
                             System.out.println("Employee is part time and his today's income is Rs. "+salary);
                             break;
 
                        default : 
                   	     System.out.println("Employee is absent and his today's income is Rs. 0");
                        }                      
                }
        }
