public class EmployeeWageUC6 {
	public static final int isPartTime=1;
	public static final int isFullTime=2;
	public static final int EmpRatePerHour=20;
	public static final int NumOfWorkingDays=20;
	public static final int MaxHrsInMonth=100;

	public static void main(String[] args) {

		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;

		while (totalEmpHrs <= MaxHrsInMonth && totalWorkingDays < NumOfWorkingDays) {
			totalWorkingDays++;
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
			totalEmpHrs+=empHrs;
			System.out.println("Day#: "+totalWorkingDays+ "Emp Hrs: "+empHrs);
		}
		int totalEmpWage=totalEmpHrs*EmpRatePerHour;
		System.out.println("Total Emp Wage: "+totalEmpWage);
	}
}
