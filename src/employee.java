/* **********************************************************
 * Programmer:	Rob Sveinson
 * Class:		CS20S
 * 
 * Assignment:	aX  qY
 *
 * Description:	describe the class you are creating
 *
 * 
 * *************************************************************
 */
 
 // import files here as needed
 
 
 public class employee
 {  // begin class
 	
 	// *********** class variables **********
 	 private static int nextID = 1000;
 	
     
 	// ********** instance variable **********
 	
        int id;
        double hourwage;//hourly wage
        int hours;
        
        
 	// ********** constructors ***********
 	
      /**************************************************
      * Purpose:    create a new employee object with default 
      *             properties
      * 
      * Interface:
      * in:         none
      * returns:    none
      **************************************************/
     public employee(){
         id = nextID++;     // set id and incremnet next id
         
     } // end default constructor
     
      /**************************************************
      * Purpose:    create a new circle object with initialized 
      *             properties
      * 
      * Interface:
      * in:        
      * returns:    none
     * @param i
     * @param r
      **************************************************/
     public employee(int i, int r){
         id = nextID++;     // set id and incremnet next id
         hours = i;
         hourwage = r;
} // end initialized constructor 
     
 	// ********** accessors **********
 	
        /**************************************************
      * Purpose:    get the id of the employee
      * 
      * Interface:
      * in:         none
      * returns:    id: int
      **************************************************/
     public int getId(){
         return id;
} // end getId
     
     /**************************************************
      * Purpose:    get the hours worked
      * 
      * Interface:
      * in:         none
      * returns:    id: int
      **************************************************/
     public int getHours(){
         return hours;
} // end getHourWage
     
         /**************************************************
      * Purpose:    get the hourly wage
      * 
      * Interface:
      * in:         none
      * returns:    id: int
      **************************************************/
     public double getHourWage(){
         return hourwage;
} // end getHourWage
     
         /**************************************************
      * Purpose:    get the hours worked
      * 
      * Interface:
      * in:         none
      * returns:    id: int
      **************************************************/
     public double getRegPay(){
         double regpay = 0;
         if(this.getHours() <= 40){
         regpay = hourwage * this.getHours();
         }//end if
         else{
          regpay = hourwage * 40;   
         }//end else  
         return regpay;
} // end getId
     
            /**************************************************
      * Purpose:    get the hours worked
      * 
      * Interface:
      * in:         none
      * returns:    id: int
      **************************************************/
     public double getOverPay(){
         double overpay = 0.0;
         if(this.getHours() >= 40){
         overpay = hourwage * (this.getHours() - 40) * 1.5;
         }//end if 
         return overpay;
} // end getId
     
            /**************************************************
      * Purpose:    get the hours worked
      * 
      * Interface:
      * in:         none
      * returns:    id: int
      **************************************************/
     public double getGrossPay(){ 
         return this.getOverPay() + this.getRegPay();
} // end getId
 	// ********** mutators **********
 
     public String toString(){
String strout;
strout = "Employee " + this.getId() + "\n";
strout += "Hours worked: " + this.getHours() + "\n";
strout += "Hourly wage: " + this.getHourWage() + "\n";
strout += "Regular pay: " + this.getRegPay() + "\n";
strout += "Overtime pay: " + this.getOverPay() + "\n";
strout += "Gross pay: " + this.getGrossPay() + "\n\n";
return strout;         
     }//end to String
     
     public void formatedOutput(){
    
     System.out.format("%8s %7s %4s %.2f %5s %.2f %4s %.2f %3s %.2f\n",this.getId(),this.getHours(),"$",this.getHourWage(),"$",this.getRegPay(),"$",this.getOverPay(),"$",this.getGrossPay() );
     }//end forout
 }  // end class