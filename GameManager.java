package mp;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections

public class GameManager {

	public static void main(String[] args)
	{
		
		Board board = new Board();
		Scanner scan = new Scanner(System.in);
		boolean player1Turn = true;
		ArrayList<AnimalPiece> animalType = new ArrayList<>();
		animalType.add(new Elephant(0, 0, true)); //position 0, 0 will fix later
		animalType.add(new Lion(0, 0, true));
		animalType.add(new Tiger(0, 0, true));
		animalType.add(new Leopard(0, 0, true));
		animalType.add(new Wolf(0, 0, true)); //position 0, 0 will fix later
		animalType.add(new Dog(0, 0, true));
		animalType.add(new Cat(0, 0, true));
		animalType.add(new Rat(0, 0, true));
		
		
		System.out.println(" Jungle King");
		System.out.println(" 1 - Instructions: ");
		System.out.println(" 2 - Start Game");

		System.out.println("Enter Player 1's name");
		Player player1 = new Player(scan.nextLine(), true);
		System.out.println("Enter Player 2's name");
		Player player2 = new Player(scan.nextLine(), false);

		Collection.shuffle(animalType);
		System.out.println("Animals are shuffled, choose one to determine who will go first");
		System.out.println("Enter Player 1's choice");
		int ch1 = scan.nextInt() - 1;
		System.out.println("Enter Player 2's choice");
		int ch2 = scan.nextInt() - 1;

		




		
		

			
		}
		
	
	}

}
