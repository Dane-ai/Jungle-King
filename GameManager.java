package mp;

import java.util.ArrayList;
import java.util.Scanner;

public class GameManager {

	public static void main(String[] args)
	{
		
		Board board = new Board();
		ArrayList<Player> players = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		boolean start = true;
		boolean player1Turn = true;
		
		System.out.println(" Jungle King");
		System.out.println(" 1 - Instructions");
		System.out.println(" 2 - Start Game");

		System.out.println("Enter Player 1's name");
		Player player1 = new Player(scanner.nextLine(), true);
		System.out.println("Enter Player 2's name");
		Player player2 = new Player(scanner.nextLine(), false);
		while (start){
		

			
		}
		
	
	}

}
