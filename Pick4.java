/* File: Pick4.java
 * Author: Anthony Argento
 * Date: 10 July 2016
 * Purpose: Define the secondary class of a lottery program
 * Description: This class will generate random numbers to be 
 * 				retreived from the primary class of this program. 
 */

import java.util.Random; //import required statement

public class Pick4 { //start of secondary class
	
	//initialize required variables
	private int randA;
	private int randB;
	private int randC;
	private int randX;

	//constructor
	public Pick4 (int randomA, int randomB, int randomC,
		int randomX) {
		randA = randomA;
		randB = randomB;
		randC = randomC;
		randX = randomX;
	}

	Random randomGen = new Random(); //construct new Random class instance

	//default constructor
	public Pick4 () {
		randA = randomGen.nextInt(9);
		randB = randomGen.nextInt(9);
		randC = randomGen.nextInt(9);
		randX = randomGen.nextInt(9);
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
	//setX
	public void setX(int randomX) {
		randX = randomX;
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
	// getX
	public int getX() {
		randX = randomGen.nextInt(9);
		return randX;
	}
	
} //end secondary class
