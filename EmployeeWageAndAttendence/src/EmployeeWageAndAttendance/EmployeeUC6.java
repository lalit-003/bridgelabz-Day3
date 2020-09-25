package EmployeeWageAndAttendance;

public class EmployeeUC6 {


    public static void main(String args[])
    {
      

       int iFullTime=1;
       int iPartTime=2; 
         int iEmpRate=20;
        int iEmpHrs=0;
         int iEmpWage=0;
       int iMaxWorkingDays=20;
         int iMaxWorkingHrs=100;
         int iTotalWage =0;
         int iWorkingHrs=0;
         int iWorkingDays=0;
     
      while(iWorkingDays < iMaxWorkingDays && iWorkingHrs < iMaxWorkingHrs)
        {
             iWorkingDays++;
       int iEmpAttend =(int) Math.floor(Math.random()*10)%3;

      switch(iEmpAttend)
            {
             case 1:
                  iEmpHrs=8;
                iWorkingHrs=iWorkingHrs+iEmpHrs;
                    break;
              case 2:  
                    iEmpHrs=4;

                iWorkingHrs=iWorkingHrs+iEmpHrs;
                     break;
                default:
                 iEmpHrs=0;
            }
           iEmpWage = iEmpHrs*iEmpRate;
           iTotalWage =iTotalWage+iEmpWage;
            
}
       System.out.println("Total Wage : " +iTotalWage );  
    }
}
