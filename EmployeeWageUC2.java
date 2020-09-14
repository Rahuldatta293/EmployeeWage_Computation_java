public class EmployeeWageUC2 {

public static void main(String[] args) {

int isFullTime=1;
int EmpRatePerHour=20;

int empHrs=0;
int empWage=0;

double empcheck=Math.floor(Math.random()*10)%2;

if(empcheck==isFullTime)
	empHrs=8;
else
	empHrs=0;
empWage=empHrs*EmpRatePerHour;
System.out.println("Emp Wage: "+ empWage);
}
}
