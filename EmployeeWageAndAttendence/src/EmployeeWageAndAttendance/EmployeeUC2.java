package EmployeeWageAndAttendance;

public class EmployeeUC2 {

	public static void main(String args[])
    {
       int iFullTime=1;
         int iEmpRate=20;
        int iEmpHrs=0;
         int iEmpWage=0;

       double dEmpAttend = Math.floor(Math.random()*10)%2;

      if (dEmpAttend == iFullTime)
            {
                  iEmpHrs=8;
             }
       else
            {
             iEmpHrs=0;
            }
           iEmpWage = iEmpHrs*iEmpRate;
       System.out.println("Emp Wage : " +iEmpWage );  
    }
}
