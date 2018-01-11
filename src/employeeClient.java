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

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Random;

public class employeeClient
{  // begin class
	public static void main(String args[])
	{  // begin main
	// ***** declaration of constants *****
	
	// ***** declaration of variables *****
	
         employee[] emparray = new employee[5];
            
	// ***** create objects *****
		
            for(int count = 0; count < 5; count++){
             emparray[count] = new employee(new Random().nextInt(60) + 1, new Random().nextInt(35) + 5);
            }//end for
            
		
	// ***** create input stream *****
	
		//ConsoleReader console = new ConsoleReader(System.in);
		
	// ***** Print Banner *****
	
		System.out.println("**********************************");
		System.out.println("NAME:        Your Name Here");
		System.out.println("Class:       CS30S");
		System.out.println("Assignment:  Ax Qy");
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