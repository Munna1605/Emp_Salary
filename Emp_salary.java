import java.util.*;
class Emp_salary
{
	public static void main(String [] args)
        {
	Scanner x = new Scanner(System.in);

	 double bs,da,hra,gs;
	System.out.println("ENTER THE BASIC SALARY");
	 bs=x. nextDouble();
         
	 
	if(bs<1500)
	{
		da=bs*10/100;
		hra=bs*90/100;

	}
	else
		{
		hra=500;
		da=bs*98/100;
		}
	gs=bs+hra+da;	
	System.out.println("gross salary="+gs); 
	}
}