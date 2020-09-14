public class EmployeeWageUC8 {
        public static final int isPartTime=1;
        public static final int isFullTime=2;

        public static int computeEmpWage(String company, int EmpRatePerHour, int NumOfWorkingDays, int MaxHoursPerMonth) {

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
                int totalEmpWage=totalEmpHrs*EmpRatePerHour;
                System.out.println("Total Emp Wage for company: "+company+" is: "+totalEmpWage);
                return totalEmpWage;
        }

        public static void main(String[] args) {
                computeEmpWage("DMart", 20, 2, 10);
		computeEmpWage("Reliance", 10, 4, 20);
        }
}
