package payslip;

import java.util.Scanner;

public class Payslip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scan=new Scanner(System.in);
 int r;
 int e;
 int x;
 Scanner scanString=new Scanner(System.in);
 String n;
 String s;
 String k;
 System.out.println("ENTER THE EMPLOYEE NUMBER TO GENERATE PAYSLIP : ");
 System.out.println("ENTER THE EMPLOYEE NAME: ");
 System.out.println("ENTER DESIGNATION: ");
 System.out.println("ENTER THE DAYS WORKED: ");
 System.out.println("ENTER THE PAY RATE: ");
 System.out.println("ENTER THE GEN. DATE: ");
 r=scan.nextInt();
 n=scanString.nextLine();
 s=scanString.nextLine();
 e=scan.nextInt();
 x=scan.nextInt(); 
 k=scanString.nextLine();
 System.out.println(""+r);
 System.out.println("");
 System.out.println("                             SHREE KRISHNA CHEMISTS AND DRUGGIST");
 System.out.println("                                       SALARY MONTH 9 2013"); 
 System.out.print("\tEMP.NO.: "+r);
 System.out.print("\t\t\tEMP.NAME: "+n);
 System.out.println("\t\tDESIGNATION: "+s);
 System.out.print("\tDAYS WORKED: "+e);
 System.out.print("\t\t\tPAY RATE: "+x);
 System.out.println("\t\t\tGEN.DATE: "+k);
 System.out.println("_______________________________________________________________________________________________");
 System.out.print("\tEARNINGS");
 System.out.print("\t\tAMOUNT(RS.)");
 System.out.print("\t\tDEDUCTIONS");
 System.out.println("\t\tAMOUNT(RS.)");
 System.out.println("_______________________________________________________________________________________________");	
 System.out.print("\tBASIC PAY");
 int y=e*x;
 System.out.print("\t\t"+y);
 System.out.print("\t\t\tP.F.");
 System.out.println("\t\t\t"+(y/10));	
 System.out.print("");
 System.out.print("");
 final String tax="PROF.TAX";
 System.out.print("\t\t\t\t\t\t\t"+tax);
 System.out.println("\t\t"+(0.02*y));
 System.out.println("_______________________________________________________________________________________________");	
 System.out.print("\tGROSS EARN.");
 System.out.print("\t\t10000");
 System.out.print("\t\t\tTOTAL DEDUCT.");
 System.out.println("\t\t1200");
 System.out.print("");
 System.out.print("");
 System.out.print("\t\t\t\t\t\t\tNET PAY");
 System.out.println("\t\t\t8800");
 System.out.println("_______________________________________________________________________________________________");	
	
	
	
	
	
	
	}

}
