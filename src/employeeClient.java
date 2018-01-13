// **********************************************************************
// Programmer:	Evan chartrand
// Class:		CS30S
//
// Assignment:	Assignment3
//
// Description:	Displays the payroll for some employees
//
//
//	Input:		a data file with wages and hours worked
//
//  Output:		prints some information about the employees compensation
// ***********************************************************************

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

public class employeeClient
{  // begin class
	public static void main(String args[]) throws FileNotFoundException, IOException
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
            String[] tokens  = null;
            String strin;
            String delim = " "; //a delimeter for parsing strings
         employee[] emparray = new employee[5];//makes an array of employees
            
         
	// ***** create objects *****
	BufferedReader fin = new BufferedReader(new FileReader("employeeData.txt"));//for reading data from a texxt file	
        
            for(int count = 0; count < 5; count++){
              strin = fin.readLine();
              tokens = strin.split(delim);
                emparray[count] = new employee(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1])); //declares employee object with random hours worked and hourly wage
            }//end for
            
		
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		System.out.println("**********************************");
		System.out.println("NAME:        Evan");
		System.out.println("Class:       CS30S");
		System.out.println("Assignment:  Assignment 36");
		System.out.println("**********************************");//prints a banner

	// ***** output *****
        
	 System.out.format("%8s %6s %7s %9s %6s %8s \n","Employee id","Hours","Hourly wage","Regular Pay","Overtime","Gross Pay");//prints a table 
	for(int count = 0; count < 5; count++){
         emparray[count].formatedOutput();//prints the info for the table
        }//end for

        System.out.println("\n Employee 1004's regular pay: " + "$" + emparray[4].getRegPay());
        System.out.println("\n Employee 1002's overtime pay: " + "$" + emparray[2].getOverPay());
        System.out.println("\n Employee 1003's hourly wage: " + "$" + emparray[3].getHourWage());//prints some specific info
        
	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
}  // end class