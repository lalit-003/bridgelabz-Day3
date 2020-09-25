package EmployeeWageAndAttendance;

public class EmployeeUC5 {
	public static void main(String[] args){


    int iFullTime=1;
    int iPartTime=2; 
      int iEmpRate=20;
     int iEmpHrs=0;
      int iEmpWage=0;
    int iNoOfDays=20;
      int iTotalWage =0 ;
  
   for (int i=0;i<iNoOfDays;i++)
     {
    int iEmpAttend =(int) Math.floor(Math.random()*10)%3;

   switch(iEmpAttend)
         {
          case 1:
               iEmpHrs=8;
                 break;
           case 2:  
                 iEmpHrs=4;
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
