/*  IN THIS PROGRAM WE LEARN 1) HOW TO INPUT AND SCAN THE DATA FROM THE USER WITH DIFFERENT DATATYPES(INT, CHAR, STRING).
                             2) HOW TO  USE SWITCH CASE.
                             3) CREATING INVOICE USING SWITCH CASE. 

                 I CHOOSE EMPLOYEE JOB ROLE AS A SWITCH CASE TO FIND THE SALARY , % OF TAX AND ESTIMATE TAKE HOME SALARY.     */ 

import java.util.*;

class Invoice
{
public static void main(String args[])

{
       double High_level = 150000, Mid_high = 100000, Mid_level = 80000, Mid_low = 50000, Low_level = 25000 ;
	   
	   double it1= 3 , it2 = 5, it3 = 8 , it4 = 12 , it5= 18;

	   Scanner scanner = new Scanner(System.in);
	   
	   System.out.print("Enter a Employeer Name: ");
	   String name = scanner.nextLine();
	   
	  
	   System.out.print("Enter Employeer Id: ");
	   int Id = scanner.nextInt();
	   
	   System.out.println("Select job role  \n a. Software Engineer \n b. Web Developer \n c. Manual Tester \n d. Associate Traniee \n e. Traniee");
	   char option = scanner.next().charAt(0);
	   
	   
	   switch(option)
	   {
		   case 'a':
		   System.out.println("*****************************INVOICE******************************************");
		   System.out.println("Employeer Name              : " + name);
		   System.out.println("Employeer Id                : " + Id);
		   System.out.println("Pay role                    : " + High_level);
		   System.out.println("Income Tax 18% is Applicaple: " + (it5*(High_level/100)));
		   System.out.println("Estimate Take Home Salary   : " + (High_level-(it5*(High_level/100))));
		   break;
		   
		   case 'b':
		   System.out.println("*****************************INVOICE******************************************");
		   System.out.println("Employeer Name              : " + name);
		   System.out.println("Employeer Id                : " + Id);
		   System.out.println("Pay role                    : " + Mid_high);
		   System.out.println("Income Tax 12% is Applicaple: " + (it4*(Mid_high/100)));
		   System.out.println("Estimate Take Home Salary   : " + (Mid_high-(it5*(Mid_high/100))));
		   break;
		   
		   case 'c':
		   System.out.println("*****************************INVOICE******************************************");
		   System.out.println("Employeer Name              : " + name);
		   System.out.println("Employeer Id                : " + Id);
		   System.out.println("Pay role                    : " + Mid_level);
		   System.out.println("Income Tax 8% is Applicaple : " + (it3*(Mid_level/100)));
		   System.out.println("Estimate Take Home Salary   : " + (Mid_level-(it5*(Mid_level/100))));
		   break;
		   
		   case 'd':
		   System.out.println("*****************************INVOICE******************************************");
		   System.out.println("Employeer Name              : " + name);
		   System.out.println("Employeer Id                : " + Id);
		   System.out.println("Pay role                    : " + Mid_low);
		   System.out.println("Income Tax 5% is Applicaple : " + (it2*(Mid_low/100)));
		   System.out.println("Estimate Take Home Salary   : " + (Mid_low-(it5*(Mid_low/100))));
		   break;
		   
		   case 'e':
		   System.out.println("*****************************INVOICE******************************************");
		   System.out.println("Employeer Name              : " + name);
		   System.out.println("Employeer Id                : " + Id);
		   System.out.println("Pay role                    : " + Low_level);
		   System.out.println("Income Tax 3% is Applicaple : " + (it1*(Low_level/100)));
		   System.out.println("Estimate Take Home Salary   : " + (Low_level-(it5*(Low_level/100)))); 
		   break;
		   
		   default: System.out.println("Invalied");
		   
		   
		   
		   
		   
		   
	   }
	   
	   
	   
	
	   
	   
}
}