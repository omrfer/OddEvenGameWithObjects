import java.util.Scanner;
import java.util.Random;
public class OEG {

	public static void main(String[] args) {
				Random rnumber = new Random();
				Scanner input = new Scanner(System.in);
				int cpunum = rnumber.nextInt(6) + 1;
				// System.out.println(cpunum);
				String guess, cpunumstring,repeat;
				int  games = 0, evens = 0, odds = 0, x;
				double win = 0, loss = 0;
			
				System.out.printf("A dice will roll a number between 1 and 6.%nDo you think the number is odd or even?%n");
				do {
					x=0;
				// System.out.println(cpunumstring);
				guess = input.nextLine();
				Diceroll class1 = new Diceroll();
				cpunum = class1.GetANumber();
				oddoreven class2 = new oddoreven(cpunum);
				cpunumstring = class2.WhatIsIt();
				//Feeding class2 information from class 1
				
				if (guess.equalsIgnoreCase(cpunumstring)) {
					games++;
					win++;
					System.out.printf("That's right! The number was %d.", cpunum);
				} else {
					games++;
					loss++;
					System.out.printf("Wrong! The number was %d.%n",cpunum);
				}
				System.out.printf("The amount of games played is %d.%nYour win percentage is %f.%n",games, win/(win+loss));
				System.out.println("Would you like to keep playing? Enter Y or yes to continue.");
				repeat = input.next();
				if (repeat.equalsIgnoreCase("Y") || repeat.equalsIgnoreCase("yes")) {
					x = 1;
					System.out.printf("Let's reroll.%nIs it odd or even?");
					cpunum = class1.GetANumber();
					guess = input.nextLine();}
					else {
						x = 2;
						System.out.printf("Goodbye.%nYour overall guess percentage was %f.", win/(loss+win));
					}
				}while (x==1);
				
			
				}
}
			

	
	

