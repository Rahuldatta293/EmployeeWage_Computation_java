public class EmployeeWageUC9 {
        public static final int isPartTime=1;
        public static final int isFullTime=2;

	private final String company;
	private final int EmpRatePerHour;
	private final int NumOfWorkingDays;
	private final int MaxHoursPerMonth;
	private int totalEmpWage;

        public EmployeeWageUC9(String company, int EmpRatePerHour, int NumOfWorkingDays, int MaxHoursPerMonth) {
		this.company = company;
		this.EmpRatePerHour = EmpRatePerHour;
		this.NumOfWorkingDays = NumOfWorkingDays;
		this.MaxHoursPerMonth = MaxHoursPerMonth;
}

	public void computeEmpWage() {

                int empHrs=0;
                int totalEmpHrs=0;
                int totalWorkingDays=0;

                while (totalEmpHrs <= MaxHoursPerMonth && totalWorkingDays < NumOfWorkingDays) {
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
                totalEmpWage=totalEmpHrs*EmpRatePerHour;
	}

	@Override
	public String toString() {
              return "Total Emp Wage for company: "+company+" is: "+totalEmpWage;
        }

        public static void main(String[] args) {
		EmployeeWageUC9 dMart=new EmployeeWageUC9("Dmart", 20, 2, 10);
		EmployeeWageUC9 reliance=new EmployeeWageUC9("Reliance", 10, 4, 20);
		dMart.computeEmpWage();
		System.out.println(dMart);
		reliance.computeEmpWage();
		System.out.println(reliance);
		}
}
