import java.util.*;
import java.lang.*;
public class EmpWageComputation {
	public static void main(String[] args) {
                        System.out.println("Welcome to EMPLOYEE WAGE COMPUTAION PROGRAM");
                        int Is_Present=(int)Math.floor(Math.random()*10)%2; //creating random
                        int salary=0;
                        if(Is_Present==1)   // checking presence with the help of if condition
                        {	
                    	     int FullDayHour=8;
                             int WagePerHour=20;
                    	     salary+=WagePerHour*FullDayHour;
                             System.out.println("Employee is present and his today's income is Rs. "+salary);
                        
                        }
                        else
                   	     System.out.println("Employee is absent and his today's income is Rs. "+salary);
}
        }




