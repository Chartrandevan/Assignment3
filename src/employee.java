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
      **************************************************/
     public employee(int i, double r){
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
         double regpay = 0.0;
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
         if(this.getHours() <= 40){
         overpay = hourwage * (this.getHours() - 40);
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
 
 }  // end class