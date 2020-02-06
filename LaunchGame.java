import java.util.*;

class LaunchGame 
{
	public static void main(String[] args) 
	{
		Umpire u=new Umpire();

		u.collectNumFromGuesser();
		u.collectFromPlayer();
		u.compare();
	}
}

class Guesser
{
	int gnum;

	int guessNum()
	{
		System.out.println("Gusser please Guess the Number ");
		Scanner scan=new Scanner(System.in);
		gnum=scan.nextInt();

		return gnum;
	}
}

class Player
{
	int pnum;

	int guessNum()
	{
		System.out.println("Player please Guess the Number ");
		Scanner scan=new Scanner(System.in);
		pnum=scan.nextInt();

		return pnum;
	}
}

class Umpire
{
	int numfromguesser;
	int numfromplayer1;
	int numfromplayer2;
	int numfromplayer3;

	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numfromguesser=g.guessNum();
	}

	void collectFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();

		numfromplayer1=p1.guessNum();
		numfromplayer2=p2.guessNum();
		numfromplayer3=p3.guessNum();
	
	}

	void compare()
	{
		if (numfromguesser==numfromplayer1)
		{
			System.out.println("player 1 is the winner!!");
		}
		else if (numfromguesser==numfromplayer2)
		{
			System.out.println("player 2 is the winner!!");
		}
		else if(numfromguesser==numfromplayer3)
		{
			System.out.println("player 3 is the winner!!");
		}
		else
		{
			System.out.println("LOST!!Retry Again");
		}
	}

}