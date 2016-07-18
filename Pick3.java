/* File: Pick3.java
 * Author: Anthony Argento
 * Date: 10 July 2016
 * Purpose: Define the secondary class of a lottery program
 * Description: This class will generate random numbers to be 
 * 				retreived from the primary class of this program. 
 */

import java.util.Random; //import required statement

public class Pick3 { //start of secondary class
	
	//initialize required variables
	private int randA;
	private int randB;
	private int randC;

	//constructor
	public Pick3 (int randomA, int randomB, int randomC) {
		randA = randomA;
		randB = randomB;
		randC = randomC;
	}

	Random randomGen = new Random(); //construct new Random class instance

	//default constructor
	public Pick3 () {
		randA = randomGen.nextInt(9);
		randB = randomGen.nextInt(9);
		randC = randomGen.nextInt(9);
	}

	//setter methods 
	//setA
	public void setA(int randomA) {
		randA = randomA;
	}
	//setB
	public void setB(int randomB) {
		randB = randomB;
	}
	//setC
	public void setC(int randomC) {
		randC = randomC;
	}

	//getter methods
	// getA
	public int getA() {
		randA = randomGen.nextInt(9);
		return randA;
	}
	// getB
	public int getB() {
		randB = randomGen.nextInt(9);
		return randA;
	}
	// getC
	public int getC() {
		randC = randomGen.nextInt(9);
		return randC;
	}
		
} //end secondary class
