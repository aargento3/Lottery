/* File: Lottery.java
 * Author: Anthony Argento
 * Date: 10 July 2016
 * Purpose: Define the primary class of a lottery program
 * Description: This program will allow the user to select various
 * 				options to the end of generating random values in 
 * 				a lottery type drawing. User will be able pick if they
 * 				wish to play, pick between 3 different types of games 
 * 				and finaly the number of times they wish to play. All
 *				options will be fed back to user along with results. 
 */

import java.util.*; //import required statements
		
public class Lottery { //start of primary class
	public static void main(String[] args){ //start of main method
		
		//construct lottery
		Pick5 pick5 = new Pick5();
		Pick4 pick4 = new Pick4();
		Pick3 pick3 = new Pick3();

		//scanner class to read in user inputs
		Scanner scannerIn = new Scanner(System.in); 
		
		//define variables
		int cntDSign = 0;
		int gamePick = 3;
		int games = 1;
		int gameCnt = 0;
		boolean play;
		boolean playOn = false;
		String willPlay;
		int loopCnt = 0;
		int pick3SumA, pick3SumB, pick3SumC;
		int masterSum = 0;
		
		//display a Welcome note
		System.out.println(" "); //print blankline for readbility
	
		for (cntDSign = 1; cntDSign < 31; cntDSign++){ //loop to print $s
			System.out.print("\u0024");
		} //end for loop
		
		System.out.println(" "); //print blankline for readbility
		System.out.println("Welcome to the Argento lottery");	
	
		for (cntDSign = 1; cntDSign < 31; cntDSign++){ //loop to print $s
			System.out.print("\u0024");
		} //end for loop
		
		System.out.println(" "); //print blankline for readbility
		System.out.println(" "); //print blankline for readbility
		
		do { //begin do while loop so multiple runs can be accomplished
					
			//poll user for data
			System.out.println("Do you wish to make lottery game selections?");
			System.out.println("Enter Y or y for yes, N or n for no.");
			willPlay = scannerIn.nextLine(); //scan in user input
		
			//if statements and while loop to ensure correct entry for this option
			if (willPlay.equals("Y") || willPlay.equals("y") || willPlay.equals("N") || willPlay.equals("n") ) { 
				System.out.println("You entered: " + willPlay);}
			else{
				play = false;
					while (play == false){
						System.out.println(" ");
						System.out.println("That is an invalid entry.");
						System.out.println("Valid entries are as follows: Y, y, N, or n");
						System.out.println("Please enter a valid response.");
						willPlay = scannerIn.nextLine(); // Variable set to user entered data
					
						if (willPlay.equals("Y") || willPlay.equals("y") || willPlay.equals("N") || willPlay.equals("n") ) { 
							System.out.println("You entered: " + willPlay);
							play = true;
							break;
						} //end sub if statement
				
					System.out.println("You entered: " + willPlay);
					} //end while loop
			} //end if else statement for willPlay
		
			//determine if user acutally wants to participate
			//if user does not wish to continue report loopCnt and masterSum
			if (willPlay.equals("N") || willPlay.equals("n")){
				System.out.println("Since you do not wish to play, program will now exit");
				System.out.println("You have played " + loopCnt + " times.");
				System.out.println("The grand sum total of all random numbers generated was: " + masterSum);
				System.exit(0);
				return;
			} else{
				playOn = true;
			} //end if statement
		
			//determine which game user would like to play
			System.out.println("Which lottery game do you want to play?");
			System.out.println("Enter 3 for the Pick3, Enter 4 for the Pick4, Enter 5 for the Pick5");
			gamePick = scannerIn.nextInt();
		
			//while loop to ensure user enters a valid response
			while (gamePick <3 || gamePick >5){
				System.out.print("You entered an invalid game.");
				System.out.println(" Please enter a valid game (3, 4 or 5)");
				gamePick = scannerIn.nextInt(); //variable set 
				System.out.println("You entered: " + gamePick);
			} //end while loop for gamePick 

			//determine how many games user wishes to play
			System.out.println("How many games would you like to play?");
			System.out.println("Enter any number from 1 to 20");
			games = scannerIn.nextInt();
		
			//while loop to ensure user does not enter a value greater than 20 or less than 1
			while (games <1 || games >20){
				if (games == 0) { //exit program if user enters a 0
					System.out.println("Since you do not wish to play, program will now exit");
					System.out.println("You have played " + loopCnt + " times.");
					System.out.println("The grand sum total of all random numbers generated was: " + masterSum);
					System.exit(0);
					return;
				} // end if statement
				System.out.print("You entered an invalid number of games.");
				System.out.println(" Please enter a valid number from 1-20");
				games = scannerIn.nextInt(); // Variable set 
				System.out.println("You entered: " + games);
			} //end while loop
		
			gameCnt = games; //define variable for use in do/while loops
		
			//code for Pick3 game
			int overAllSumPick3 = 0;
		
			//if statement with getter statements to retrieve new random numbers on each loop
			//while gameCnt > 0
			if (gamePick == 3){
				do{
					int pick3A = pick3.getA();
					int pick3B = pick3.getB();
					int pick3C = pick3.getC();
					System.out.println("Random numbers generated are: " + pick3A + "" + pick3B + "" + pick3C);
					int sumPick3 = (pick3A + pick3B + pick3C);
					System.out.println("\t The sum of random numbers " + pick3A + " " + pick3B + " " + pick3C + "  is: " + sumPick3);
					gameCnt--;
					overAllSumPick3 = overAllSumPick3 + sumPick3;
				} while (gameCnt > 0);
				System.out.println(" "); //print blank line for readability	
				System.out.println("Sum of all random numbers is: " + overAllSumPick3);	
			} //end Pick3 if statement
		
			//code for Pick4 game
			int overAllSumPick4 = 0;
		
			//if statement with getter statements to retrieve new random numbers on each loop
			//while gameCnt > 0
			if (gamePick == 4){
				do{
					int pick4A = pick4.getA();
					int pick4B = pick4.getB();
					int pick4C = pick4.getC();
					int pick4X = pick4.getX();
					System.out.println("Random numbers generated are: " + pick4A + "" + pick4B + "" + pick4C + "" + pick4X);
					int sumPick4 = (pick4A + pick4B + pick4C + pick4X);
					System.out.println("\t The sum of random numbers " + pick4A + " " + pick4B + " " + 
						pick4C + " " + pick4X + " " + "is: " + sumPick4);
					gameCnt--;
					overAllSumPick4 = overAllSumPick4 + sumPick4;
				} while (gameCnt > 0);	
				System.out.println(" "); //print blank line for readability
				System.out.println("Sum of all random numbers is: " + overAllSumPick4);	
			} //end Pick4 if statement
		
			//code for Pick5 game
			int overAllSumPick5 = 0;
		
			//if statement with getter statements to retrieve new random numbers on each loop
			//while gameCnt > 0
			if (gamePick == 5){
				do{
					int pick5A = pick5.getA();
					int pick5B = pick5.getB();
					int pick5C = pick5.getC();
					int pick5X = pick5.getX();
					int pick5Y = pick5.getY();
					System.out.println("Random numbers generated are: " + pick5A + "" + pick5B + 
						"" + pick5C + "" + pick5X + "" + pick5Y);
					int sumPick5 = (pick5A + pick5B + pick5C + pick5X + pick5Y);
					System.out.println("\t The sum of random numbers " + pick5A + " " + pick5B + " " + pick5C +
						" " + pick5X + " " + pick5Y + " is: " + sumPick5);
					gameCnt--;
					overAllSumPick5 = overAllSumPick5 + sumPick5;
				} while (gameCnt > 0);
				System.out.println(" "); //print blank line for readability
				System.out.println("\t Sum of all random numbers is: " + overAllSumPick5);	
			} //end Pick5 if statement
		
			//code to determine if user wishes to continue playing
			System.out.println(" "); //print blank line for readability
			loopCnt = loopCnt + 1; //counter for number of games played
		
			masterSum = masterSum + overAllSumPick3 + overAllSumPick4 + overAllSumPick5;
			
			willPlay = scannerIn.nextLine(); //reset .nextLine()
		} while (playOn = true);
		
	} //end main method
	
} //end primary class