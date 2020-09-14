public class EmployeeWageUC3 {

	public static void main(String[] args) {

	int isPartTime=1;
	int isFullTime=2;
	int EmpRatePerHour=20;
	int empHrs=0;
	int empWage=0;

	double empCheck=Math.floor(Math.random()*10)%3;
	if(empCheck==isPartTime)
		empHrs=8;
	else if(empCheck==isFullTime)
		empHrs=16;
	else
		empHrs=0;
	empWage=empHrs*EmpRatePerHour;
	System.out.println("Emp Wage; "+ empWage);
	}
}
