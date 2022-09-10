import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("rock-paper-scissors:");
		String choice = scanner.nextLine();
		
		//transfer user's choice into number for later compare
		int ch = switch (choice) {
			case "rock" -> 1;
			case "paper" -> 2;
			case "scissors" -> 3;
			default -> 0;
		};
		int random = 1 + (int)(Math.random()*3);
		
		//transfer random number to computer's choice in word
		String computer = switch (random) {
			case 1 -> "rock";
			case 2 -> "paper";
			case 3 -> "scissors";
			default -> "error";
		};
		
		// tell user computer's choice
		System.out.printf("Computer choose %s\n", computer);
		String result;
		
		// calculate result
		result = switch (random) {
			case 1 -> ch == 1 ? "draw": ch == 2 ? "you win" : "you lose";
			case 2 -> ch == 2 ? "draw": ch == 3 ? "you win"	: "you lose";
 			case 3 -> ch == 3 ? "draw": ch == 1 ? "you win" : "you lose";
 			default -> "random error";
		};
		
		// tell user if user enter other things
		if (ch==0) {
			result = "your choice error";
		};
		
		//print result
		System.out.printf("%s", result);
		scanner.close();
		}
	}
