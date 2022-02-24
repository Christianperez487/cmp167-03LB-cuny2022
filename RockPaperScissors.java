import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Enter 1 or scissors, 2 for rock, 3 for paper");
		
		int userSelection = input.nextInt();
		
		int pcSelection = rand.nextInt(3)+1;
		
		if((userSelection == 1 && pcSelection == 3) || 
		     (userSelection == 2 && pcSelection == 1) || 
		         (userSelection == 3 && pcSelection == 2)) {
			
			System.out.println("You win! Fatality");
			System.out.println("User entered: "+userSelection);
			System.out.println("PC entered: "+pcselection);
			
			
		}

	}

}
