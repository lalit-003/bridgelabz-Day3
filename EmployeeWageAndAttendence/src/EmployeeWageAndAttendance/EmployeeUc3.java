package EmployeeWageAndAttendance;

public class EmployeeUc3 {


    public static void main(String args[])
    {
       int iFullTime=1;
       int iPartTime=2; 
         int iEmpRate=20;
        int iEmpHrs=0;
         int iEmpWage=0;

       double dEmpAttend = Math.floor(Math.random()*10)%3;

      if (dEmpAttend == iFullTime)
            {
                  iEmpHrs=8;
             }
           else if(dEmpAttend==iPartTime)
            {
                    iEmpHrs=4;
                }
                      else
            {
             iEmpHrs=0;
            }
           iEmpWage = iEmpHrs*iEmpRate;
       System.out.println("Emp Wage : " +iEmpWage );  
    }
}
