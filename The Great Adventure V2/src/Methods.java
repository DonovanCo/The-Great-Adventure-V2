import java.util.Scanner;

public class Methods
	{
	static Scanner game = new Scanner(System.in);
	public static String choice;
	public static int easter = 0;
	public static int gold = (int)(Math.random()*50)+1;

	public static void beginAdv()
		{
		System.out
				.println("Welcome to \"The Great Adventure\" (Version 2).\nYour adventure will begin shortly, but first some info about the game.");
		System.out
				.println("To choose an option use \"a\", \"b\" etc. \nIf you die there are no checkpoints.\nThere are 2 easter eggs in game. \nIf you can find them all you will receive a reward at the end.");
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
			System.out
					.println("Congratulations! You found the first easter egg.\nYou wake up and find a lamp and turn it on.\nYou are in a old bed. Besides a door, there is nothing else in the room.");
			easter = easter + 1;
			} else if (choice.equals("b"))
			{
			System.out
					.println("You reach out your hand and find a lamp. You turn it on.\nYou are in a old bed. Besides a door, there is nothing else in the room.");
			} else
			{
			System.out.println("That is not an option enter a or b.");

			}
		}

	public static void askTwo()
		{
			System.out.println("You leave the room, and find yourself facing a "+AdvRunner.halloween.get(0).getAdj()+" "+AdvRunner.halloween.get(0).getMonsterType()+".");
			System.out.println("Do you a.) run, b.) hide, or c.) fight");
			choice=game.nextLine();
			if(choice.equals("a"))
				{
					System.out.println("You get away safely and find "+gold+" gold pieces.\nYou escape the building as it disappears into another dimension.\nCongratulations! You win for now.");
				}
			else if(choice.equals("b"))
				{
					System.out.println("The demon got you. Game over.");
				}
			else
				{
					System.out.println("You try to fight the demon.\nAs you throw the first punch, it turns into an "+AdvRunner.halloween.get(2).getAdj()+" "+AdvRunner.halloween.get(2).getMonsterType()+". You found the second easter egg.\nYou pick up "+gold+" gold pieces. \nYou leave the building as it disappears into another dimension.");
					easter=easter+1;
				}
		}
	public static void giveReward()
		{
		System.out.println("Do you wish to receive your reward. a.) yes b.) no");
		choice=game.nextLine();
		if(choice.equals("a"))
			{
				if(easter==1)
					{
					 System.out.println("You found one easter egg. Good job.");
					}
				else if(easter==2)
					{
						System.out.println("You found all the easter eggs! Now go outside.");
					}
				else
					{
					System.out.println("You found no easter eggs. You aren't even MLG bro. 1v1 me.");
					}
				if(gold==50)
					{
					 System.out.println("You become "+AdvRunner.halloween.get(3).getAdj()+" "+AdvRunner.halloween.get(3).getMonsterType()+".");
					}
				else if(gold==1)
					{
						System.out.println("A"+AdvRunner.halloween.get(1).getAdj()+" "+AdvRunner.halloween.get(1).getMonsterType()+" walks up to you and says \"Get on my level.\"");
					}
				else
					{
					System.out.println("You had "+gold+" gold pieces. You could do better.");
					}
			}
		else
			{
			System.out.println("Okay. Goodbye.");
			}
		}

	}
