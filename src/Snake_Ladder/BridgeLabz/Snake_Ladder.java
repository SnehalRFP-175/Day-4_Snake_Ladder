package Snake_Ladder.BridgeLabz;
/*Added UC2
 * Player rolls the dice between 1 to 6 */
import java.util.Random;

public class Snake_Ladder 
{
	private static int dice;
	
	void snakeGame() 
    {
            Random r = new Random();
        
        	dice = r.nextInt(6);
        	
        	if(dice == 0)
        	 {
        		 System.out.println("Player is at zero Position"); 
                dice++;    
             }
        	 else
        	 System.out.println("Player Rolls the dice-->"+dice);
    }  
 
	public static void main(String a[])
	{
		System.out.println("*************WELCOME TO SNAKES AND LADDERS*************\n\n");
	        
		Snake_Ladder p = new Snake_Ladder();
		p.snakeGame();
	}
}