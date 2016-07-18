/* File: Pick5.java
 * Author: Anthony Argento
 * Date: 10 July 2016
 * Purpose: Define the secondary class of a lottery program
 * Description: This class will generate random numbers to be 
 * 				retreived from the primary class of this program. 
 */

import java.util.Random; //import required statement

public class Pick5 { //start of secondary class
	
	//initialize required variables
	private int randA;
	private int randB;
	private int randC;
	private int randX;
	private int randY;

	//constructor
	public Pick5 (int randomA, int randomB, int randomC,
		int randomX, int randomY) {
		randA = randomA;
		randB = randomB;
		randC = randomC;
		randX = randomX;
		randY = randomY;
	}

	Random randomGen = new Random(); //construct new Random class instance

	//default constructor
	public Pick5 () {
		randA = randomGen.nextInt(9);
		randB = randomGen.nextInt(9);
		randC = randomGen.nextInt(9);
		randX = randomGen.nextInt(9);
		randY = randomGen.nextInt(9);
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
	//setY
	public void setY(int randomY) {
		randY = randomY;
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
	// getY
	public int getY() {
		randY = randomGen.nextInt(9);
		return randY;
	}
	
} //end secondary class
