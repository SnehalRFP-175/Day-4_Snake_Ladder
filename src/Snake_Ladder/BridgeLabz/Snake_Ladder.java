package Snake_Ladder.BridgeLabz;
/*UC-1 
 * Player is at zero Position */
public class Snake_Ladder 
{
		int dice;
		
		void snakeGame() 
	    {
	            if(dice == 0)
	            {
	            	System.out.println("Player is at zero Position");
	            }
	          
	    }
		
		public static void main(String a[])
		{
			System.out.println("*************WELCOME TO SNAKES AND LADDERS*************\n\n");
			 
			 
			Snake_Ladder p = new Snake_Ladder();
			p.snakeGame();
		}
		
	}
