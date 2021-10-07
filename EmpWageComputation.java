import java.util.*;
import java.lang.*;
public class EmpWage {
	static final int Fulltime=1;
	static final int  Parttime=2;
	public static void main(String[] args) {
		EmpWage emp = new EmpWage();             // creating object variable of class EmpWage
		emp.compute();                        //calling method compute
	}
	public void compute(){
		System.out.println("Welcome to EMPLOYEE WAGE COMPUTAION PROGRAM");
		int TotalMonthlySalary = 0;
		int TotalWorkingHour = 0;
		int day = 0;
		int FullDayHour=0;
		int WagePerHour=0;
		while(TotalWorkingHour!=100 && day!=20)
		{
			day++;
			int Random = (int)Math.floor(Math.random()*10) % 3; //creating three random numbers 
			int salary = 0;
			switch (Random)   // checking presence with the help of if condition
			{	
			case Fulltime:

				FullDayHour = 8;
				WagePerHour = 20;
				System.out.print("Employee is full time and ");
				break;
			case Parttime:
				FullDayHour = 4;
				WagePerHour = 20;
				System.out.print("Employee is part time and ");
				break;

			default : 
				System.out.print("Employee is absent and ");
			} 
			salary+= WagePerHour*FullDayHour;
			System.out.println("his day "+day+" income is Rs."+salary);
			TotalWorkingHour+= FullDayHour;
			TotalMonthlySalary+= salary;

		}
		System.out.println("======================****************=======================");
		System.out.println("Employee's final working hour is  "+TotalWorkingHour); //printing the total working hour

		System.out.println("Employee's monthly salary is Rs. "+TotalMonthlySalary);// printing the total salary

	}
}





