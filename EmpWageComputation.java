import java.util.*;
import java.lang.*;
public class EmpWage {
	static final int Fulltime=1;
	static final int  Parttime=2;
	// main method starting
	public static void main(String[] args) {
		EmpWage emp = new EmpWage(); // 
		emp.compute();
	}
	public void compute(){
		System.out.println("Welcome to EMPLOYEE WAGE COMPUTAION PROGRAM");
		int TotalMonthlySalary = 0;
		int TotalWorkingHour = 0;
		int day = 0;
		while(TotalWorkingHour<=100 && day!=20)
		{
			day++;
			int Random = (int)Math.floor(Math.random()*10)%3; //creating random
			int salary = 0;
			switch (Random)   // checking presence with the help of if condition
			{	
			case Fulltime:

				int FullDayHour = 8;
				int WagePerHour = 20;
				salary+= WagePerHour*FullDayHour;
				System.out.println("Employee is full time and his day "+day+" income is Rs. "+salary);
				TotalWorkingHour+= FullDayHour;
				break;
			case Parttime:
				int FullDayHour1 = 4;
				int WagePerHour1 = 20;
				salary+=WagePerHour1*FullDayHour1; 
				System.out.println("Employee is part time and his day "+day+" income is Rs. "+salary);
				TotalWorkingHour+= FullDayHour1;
				break;

			default : 
				System.out.println("Employee is absent and his day "+day+" income is Rs. 0");
			} 
			TotalMonthlySalary+= salary;

		}
		System.out.println("Employee's final working hour is  "+TotalWorkingHour); //printing the total working hour

		System.out.println("Employee's monthly salary is Rs. "+TotalMonthlySalary);// printing the total salary

	}
}





