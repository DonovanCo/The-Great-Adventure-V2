import java.util.ArrayList;
import java.util.Scanner;
public class AdvRunner
	{
	static ArrayList<MonsterConstruct> halloween=new ArrayList<MonsterConstruct>();

	public static void main(String[] args)
		{
		halloween.add(new MonsterConstruct("Scary", "Demon"));
		halloween.add(new MonsterConstruct("Big", "Troll"));
		halloween.add(new MonsterConstruct("Eatser", "Egg"));
		halloween.add(new MonsterConstruct("Santa", "Claus"));
		Methods.beginAdv();
		if(Methods.choice.equals("a")||Methods.choice.equals("b"))
			{
			do
				{
				Methods.askFirst();
				}
			while(!Methods.choice.equals("a")&&!Methods.choice.equals("b"));
					
					
			}
		else
			{
			System.out.println("Too bad! You're gonna play anyways.");
			do
				{
				Methods.askFirst();
				}
			while(!Methods.choice.equals("a")&&!Methods.choice.equals("b"));
			}
		Methods.askTwo();
		if(Methods.choice.equals("a")||Methods.choice.equals("c"))
			{
				Methods.giveReward();
			}

		}

	}
