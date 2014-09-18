import java.util.Scanner;

public class Methods
	{
	static Scanner game = new Scanner(System.in);
	public static String choice;

	public static void beginAdv()
		{
		System.out
				.println("Welcome to \"The Great Adventure\" (Version 2).\nYour adventure will begin shortly, but first some info about the game.");
		System.out
				.println("To choose an option use \"a\", \"b\" etc. \nIf you die there are no checkpoints.\nThere are 5 easter eggs in game. \nIf you can find them all you will receive a reward at the end.");
		System.out.println(" Do you wish to a.)start or b.)");
		choice = game.nextLine();
		}

	public static void askFirst()
		{
			System.out.println("You Awaken in a bed in a dark room. \n Do you a.) Go back to sleep b.) Look for a light source");
			choice=game.nextLine();
		}
	public static void tellNoOption()
		{
			
		}
	}
