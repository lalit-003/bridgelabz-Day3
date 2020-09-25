package EmployeeWageAndAttendance;

	public class EmployeeUc1 {


    public static void main(String args[])
    {
       int iFullTime=1;
       
       double dEmpAttend = Math.floor(Math.random()*10)%2;

      if (dEmpAttend == iFullTime)
            {
                System.out.println("employee is present,work hard");
             }
       else
            {
    	   System.out.println("employee is absent,enjoy your day");

            }
          
    }
}

