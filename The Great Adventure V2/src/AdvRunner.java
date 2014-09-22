import java.util.ArrayList;
import java.util.Scanner;
public class AdvRunner
	{

	public static void main(String[] args)
		{
		ArrayList<MonsterConstruct> halloween=new ArrayList<MonsterConstruct>();
		halloween.add(new MonsterConstruct("Scary", "Demon"));
		halloween.add(new MonsterConstruct("Big", "Troll"));
		Methods.beginAdv();
		if(Methods.choice.equals("a")||Methods.choice.equals("b"))
			{
			do
				{
				Methods.askFirst();
				}
			while(!Methods.choice.equals("a")&&!Methods.choice.equals("b"));
					
					
			}

		}

	}
