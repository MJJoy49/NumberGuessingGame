import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame
{
	public static void main(String[] args)
	{   
		System.out.println(" ");
		System.out.println(" ");
        System.out.println("                     |||||||||||||||||||||||||||||||||||| ");
		System.out.println("                     ||||||||||||  WELCOME TO  |||||||||| ");
		System.out.println("                     |||||||||||||||||||||||||||||||||||| ");
		System.out.println("                     ||  -_- NUMBER GUESSING GAME -_-  || ");
		System.out.println("                     |||||||||||||||||||||||||||||||||||| ");
		System.out.println("                     |||||||||||||||||||||||||||||||||||| ");
		System.out.println("                     ||||||||||||||||  MADE BY->M.J.Joy | ");
		System.out.println("                     |||||||||||||||||||||||||||||||||||| ");
		System.out.println("                                                          ");
	
		
		
		Scanner inputDecision= new Scanner(System.in);
		int D;
		
						System.out.println("  ____________________________________");
						System.out.println(" |                                    |");
						System.out.println(" |    Do you want to play this game   |");
						System.out.println(" |           THEN ENTER:1             |");
						System.out.println(" |----------------or------------------|");
						System.out.println(" |             not play               |");
						System.out.println(" |           THEN ENTER:0             |");
						System.out.println(" |____________________________________|");
						System.out.print(" ENTER HERE:");
		D=inputDecision.nextInt();
		
		
		int target=2;
		int GUSSNUM=0;
		int level=1;
		
						
		
			do
			{
				
					
				switch (D)
				{
					case 0:
						break;
						
					case 1:
						
						System.out.println("  _____________________________________ ");
						System.out.println(" |                                     |");
						System.out.println(" |            Start level "+level+"            |");
						System.out.println(" |_____________________________________|");
						System.out.println(" |                                     |");
						System.out.println(" |If you right guess-3time than you WIN|");
						System.out.println(" |_____________________________________|");
					
						int ok=1;
					
						do
						{
							
							Scanner inputNum= new Scanner(System.in);
							int x;
								System.out.println(" ");
								System.out.println(" --------------"+ok+" TIME------------------");
								System.out.println("  ____________________________________ ");
								System.out.println(" |                                    |");
								System.out.println(" |           Guess any number         |");
								System.out.println(" |               between              |");
								System.out.println(" |             ->0 to "+target+"<-             |");
								System.out.println(" |____________________________________|");
								System.out.print(" ENTER HERE:");
							x=inputNum.nextInt();
				
							Random randomNum= new Random();
							int r=randomNum.nextInt(target);
							ok++;
							if(x==r)
							{
								System.out.println(" ");
								System.out.println("Random number was: "+r+" AND "+"Your guess number was: "+x);
								System.out.println("  ____________________________________");
								System.out.println(" |                                    |");
								System.out.println(" |     You are very intelligent!      |");
								System.out.println(" |____________________________________|");
								
							GUSSNUM++;	
							
					
							}
			
							else
							{	
								System.out.println(" ");
								System.out.println(" Random number was: "+r+" AND "+"Your guess number was: "+x);
								System.out.println("  ____________________________________ ");
								System.out.println(" |                                    |");
								System.out.println(" |        You are a bukachuda!        |");
								System.out.println(" |____________________________________|");
						
						
							}
							
									
								
							
								
								
						}while(ok<=5);
						
							
							
							
							
							if(GUSSNUM==3)
							{
										System.out.println(" ");
										System.out.println(" ");
										System.out.println(" ------------ FINAL RESULT ------------- ");
										System.out.println("  _____________________________________");
										System.out.println(" |                                     |");
										System.out.println(" |You guessed the correct number "+GUSSNUM+" time|");
										System.out.println(" |_____________________________________|");
										System.out.println("  ____________________________________");
										System.out.println(" |                                    |");
										System.out.println(" |                                    |");
										System.out.println(" |        YOU WIN LEVEL: "+level+"            |");
										System.out.println(" |                                    |");    
										System.out.println(" |____________________________________|");
										
								level++;
								GUSSNUM=GUSSNUM-GUSSNUM;
								target=target+3;
							
							
								Scanner NEXT=new Scanner(System.in);
								System.out.print(" ");
								System.out.println(" ____________________________________ ");
								System.out.println(" |                                    |");
								System.out.println(" |   If you want to play next level   |");
								System.out.println(" |           THEN ENTER:1             |");
								System.out.println(" |----------------or------------------|");
								System.out.println(" |             not play               |");
								System.out.println(" |           THEN ENTER:0             |");
								System.out.println(" |____________________________________|");
								System.out.print(" ENTER HERE:");
								int nextLevel=NEXT.nextInt();
							
								if(nextLevel==1)
								{
									continue;
								}
							
								else
								{
									break;
								}
							
							}
						
							else
							{			System.out.println(" ");
										System.out.println(" ");
										System.out.println(" ------------ FINAL RESULT ------------- ");
										System.out.println("  _____________________________________");
										System.out.println(" |                                     |");
										System.out.println(" |You guessed the correct number "+GUSSNUM+" time|");
										System.out.println(" |_____________________________________|");
										System.out.println("  ____________________________________");
										System.out.println(" |                                    |");
										System.out.println(" |        YOU LOSE LEVEL: "+level+"           |");
										System.out.println(" |                                    |");    
										System.out.println(" |             TRY AGAIN              |");
										System.out.println(" |____________________________________|");
										
								GUSSNUM=GUSSNUM-GUSSNUM;
							
								Scanner NEXT=new Scanner(System.in);
								System.out.print(" ");
								System.out.println("  ____________________________________ ");
								System.out.println(" |                                    |");
								System.out.println(" |      If you want to play again     |");
								System.out.println(" |           THEN ENTER:1             |");
								System.out.println(" |----------------or------------------|");
								System.out.println(" |             not play               |");
								System.out.println(" |           THEN ENTER:0             |");
								System.out.println(" |____________________________________|");
								System.out.print(" ENTER HERE:");
								int nextLevel=NEXT.nextInt();
							
								if(nextLevel==1)
								{
									continue;
								}
							
								else
								{
									break;
								}
							}
								
				
				}
				
				
				break;
				
				
		
			}while(true);
		
		
		
		
			System.out.println("                    **************************************");
			System.out.println("                    |                                    |");
			System.out.println("                    |                                    |");
			System.out.println("                    |              -GOOD BYE-            |");
			System.out.println("                    |                                    |");
			System.out.println("                    |                                    |");
			System.out.println("                    **************************************");	
		
		
	
	}
}