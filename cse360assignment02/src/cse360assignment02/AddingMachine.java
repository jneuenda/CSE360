package cse360assignment02;

public class AddingMachine {
	  private int total;
	  private String returnString;
	  
	  /**
	  * Addingmachine initiates the adding machine object by setting  total = 0 and returnString = "0"
	  */
	  public AddingMachine () {
	    total = 0;  		// not needed - included for clarity 
	    returnString = "0"; // initiates return string; 
	  }
	  
	  /**
	  * getTotal returns the private total variable 
	  * @return total int
	  */
	  public int getTotal () {
	    return total;
	  }
	  
	  /**
	  * add will add a given number from the total and update returnString to reflect the numbers added 
	  * @param value int 
	  * @return void 
	  */
	  public void add (int value) {
		  returnString = returnString + " + ";
		  total = total + value;
		  returnString = returnString + value;
	  }
	  
	  /**
	  * subtract will subtract a given number from the total and update returnString to reflect the numbers subtracted 
	  * @param value int 
	  * @return void 
	  */
	  public void subtract (int value) {
		  returnString = returnString + " - ";
		  total = total - value;
		  returnString = returnString + value;
	  }
	  
	  /**
	  * toString will return a string of all transactions
	  * @return returnString String
	  */
	  public String toString () {
	    return returnString;
	  }
	  /**
	  * clear clears the total variable and return string 
	  * @return void
	  */
	  public void clear() {
		  total = 0;
		  returnString = "0";
	  }
	}