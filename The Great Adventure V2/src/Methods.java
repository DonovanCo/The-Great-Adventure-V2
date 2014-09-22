import java.util.Scanner;

public class Methods
	{
	static Scanner game = new Scanner(System.in);
	public static String choice;
	public static int easter = 0;

	public static void beginAdv()
		{
		System.out
				.println("Welcome to \"The Great Adventure\" (Version 2).\nYour adventure will begin shortly, but first some info about the game.");
		System.out
				.println("To choose an option use \"a\", \"b\" etc. \nIf you die there are no checkpoints.\nThere are 5 easter eggs in game. \nIf you can find them all you will receive a reward at the end.");
		System.out.println("Do you wish to a.)start or b.) start.");
		choice = game.nextLine();
		}

	public static void askFirst()
		{
		System.out
				.println("You Awaken in a bed in a dark room. \nDo you a.) Go back to sleep b.) Look for a light source");
		choice = game.nextLine();
		
		if (choice.equals("a"))
			{
			System.out.println("Congratulations! You found the first easter egg.");
			easter = easter + 1;
			} else if (choice.equals("b"))
			{
			System.out.println("You reach out your hand and find a lamp. You turn it on.\nYou are in a victorian style bed. there is nothing else in the room.");
			} else
			{
			System.out.println("That is not an option enter a or b.");
			
			}
		}

	}
