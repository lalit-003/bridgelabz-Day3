package EmployeeWageAndAttendance;

public class EmployeeUC4 {
	public static void main(String[] args) {

		int iFullTime = 1;
		int iPartTime = 2;
		int iEmpRate = 20;
		int iEmpHrs = 0;
		int iEmpWage = 0;

		int iEmpAttend = (int) Math.floor(Math.random() * 10) % 3;

		switch (iEmpAttend) {
		case 1:
			iEmpHrs = 8;
			break;
		case 2:
			iEmpHrs = 4;
			break;
		default:
			iEmpHrs = 0;
		}
		iEmpWage = iEmpHrs * iEmpRate;
		System.out.println("Emp Wage : " + iEmpWage);
	}
}
