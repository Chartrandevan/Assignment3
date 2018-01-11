// **********************************************************************
// Programmer:	Rob Sveinson
// Class:		CS20S
//
// Assignment:	aX qy
//
// Description:	a brief description of the program goes here
//
//
//	Input:		describe any input from keyboard or file
//
//  Output:		describe the result of your program
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
	
            String tokens [] = null;
            String strin;
            String delim = " "; //a delimeter for parsing strings
         employee[] emparray = new employee[5];
            
         
	// ***** create objects *****
	BufferedReader fin = new BufferedReader(new FileReader("employeeData.txt"));//for reading data from a texxt file	
        
            for(int count = 0; count < 5; count++){
              strin = fin.readLine();
              tokens = strin.split(delim);
             emparray[count](Integer.parseInt(tokens[0], Integer.parseInt(tokens[1]));//declares employee object with random hours worked and hourly wage
            }//end for
            
		
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		System.out.println("**********************************");
		System.out.println("NAME:        Evan");
		System.out.println("Class:       CS30S");
		System.out.println("Assignment:  Assignment 36");
		System.out.println("**********************************");
		
	// ***** get input *****
	
		// all input is gathered in this section
		// remember to put ConsoleReader.class into the
		// same folder.
	
	// ***** processing *****
	
		
	// ***** output *****
	
	for(int count = 0; count < 5; count++){
          System.out.println(emparray[count].toString()) ; 
        }//end for

	// ***** closing message *****
	
		System.out.println("end of processing");
	
	}  // end main	
}  // end class