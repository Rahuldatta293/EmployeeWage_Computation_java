public class EmployeeWageUC5 {
	public static final int isPartTime=1;
	public static final int isFullTime=2;
	public static final int EmpRatePerHour=20;
	public static final int NumOfWorkingDays=20;

	public static void main(String[] args) {

		int empHrs=0;
		int empWage=0;
		int totalEmpWage=0;

		for (int day=0; day<NumOfWorkingDays; day++) {
			int empCheck=(int)Math.floor(Math.random()*10)%3;

			switch (empCheck) {
				case isPartTime:
					empHrs=8;
					break;
				case isFullTime:
					empHrs=16;
					break;
				default:
					empHrs=0;
			}
			empWage=empHrs*EmpRatePerHour;
			totalEmpWage+=empWage;
			System.out.println("Emp Wage: "+empWage);
		}
		System.out.println("Total Emp Wage: "+totalEmpWage);
	}
}
