//Anay Goyal
//9-11-24
//CalculatePi.java
//This approximates pi two different ways. It prints each result to 2, then 
// 6 decimal places. Each result is compared to 3.141592 and the difference is 
//printed.
//Working on: Using printf and the Format class to format the decimals.
//Declare and initializing variables (D&I). A final constant.

/* Pseudocode == the plan
 * 
 * class header 
 * D&I a final constant for PI
 * 
 * main header
 * 		make an instance of the class
 * 		use the instance to call firstApprox
 * 		use the instance to call secondApprox
 * 
 * firstApproxheader
 * 		declare approx1 as a float
 * 		initialize approx1 to 0.0f
 * 		D&I diff1, set to -100.0f
 * 
 * 		set approx1 to 22/7
 * 		set diff1 to difference between approx1 and PI
 * 		print 3 blank lines, then the intro sent using PI
 * 		print approx1 to 2 places, then 6, the diff1 to 6 places
 * 
 * second Approx header
 * 		D&I approx2 as a float, initialize approx2 to 0.0f
 * 		D&I diff2, set to -100.0f
 * 
 * 		set approx2 to (4+100)*8 +62000 all divided by 20000
 * 		set diff2 to difference between approx2 and PI
 * 		print approx2 to 2 places, then 6, then diff2 to 6 places.
 */

public class CalculatePi{
	final float PI = 3.141592f;		//this is a final constant
	
	public static void main(String[] args){
		CalculatePi calcPi = new CalculatePi();
		calcPi.firstApprox();
		calcPi.secondApprox();
		
	}
	
	public void firstApprox(){
		
		float approx1;
		approx1 = 0.0f;
	
		float diff1;
		diff1 = -100.0f;
		//program what we said in the pseudocode
		approx1 = 22/7f;
		diff1 = (approx1 -PI);
		System.out.print("\n\n\n");
		System.out.println("I am approximating pi (a bit more than 3.141592)");
		System.out.println("Ways to approximate pi");
		System.out.println("\n1. 22/7");
		System.out.println("\n2. ((4+100)*8+62000)/20000\n\n");
		
		System.out.println("1. \n");
		System.out.print("The calculation 22/7 yields ");
		System.out.printf("%-4.2f or more specifically ",approx1);
		System.out.print(Format.left(approx1,8,6)+ " shown to 6 places. It is " + diff1 + "\ndifferent from "+ PI +".\n\n");
		System.out.println("The value of pi to two places = "+Format.left(approx1,10,2));
		System.out.printf("The value of pi to six places =%-10.6f\n",approx1);
		System.out.printf("diff1 =%-10.6f",diff1);
		System.out.print("\n\n\n");

	}
	
	public void secondApprox(){
		float approx2 = 0.0f;
	
		float diff2 = -100.0f;
		approx2 =( (4+100)*8 +62000)/20000f;
		diff2 = approx2-PI;
		System.out.println("2. ");
		System.out.println("The value of pie to two places =" +Format.left(approx2,10,2));
		System.out.printf("The value of pie to six places =%-10.6f\n",approx2);
		System.out.printf("diff2 =%-10.6f",diff2);
		System.out.print("\n\n\n");

		//program what we said in pseudocode
		
	}
}

