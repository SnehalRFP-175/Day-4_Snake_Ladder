package Snake_Ladder.BridgeLabz;

import java.util.Random;

/*Added UC4
 * Repeat the condition till winning point 100*/
public class Snake_Ladder 
{
	    private static int playerIndex=0;
	    private static int dice;  
		void snakeGame() 
	    {
			
	        System.out.println("*************WELCOME TO SNAKES AND LADDERS*************\n\n");
	        
	        //RANDOM
	        Random r = new Random();
	        
	        System.out.println("Player at Zero Position-->"+playerIndex);
	        
	        while( ( playerIndex != 100 ) && playerIndex <= 100)
	        {
	            dice = r.nextInt(6);
	           
	            if( dice == 0 )
	            {	
	                dice++;  
	            }
	            System.out.println("The number on the die is "+dice);
	            
	  
	            	if( (playerIndex+dice) != 100 )
	            	{
	            	
	            	playerIndex += dice;
	            	System.out.println("Player Position---> " +playerIndex+".");
	            	
	            	switch(playerIndex)
	                {
	                   
	              //====================================Ladder====================================
	                    case 4  :
	                    	System.out.println("************Ladder************\n\n");
	                    	playerIndex = playerIndex + dice;
	                    	System.out.println(" You got the ladder on----> 4......! Your new position is---- "+playerIndex);	                    	
	                        break;
	                        
	                    case 57  : 
	                    	System.out.println("************Ladder************\n\n");
	                    	playerIndex = playerIndex + dice;
	                    	System.out.println(" You got the ladder on----> 57......! Your new position is---- "+playerIndex);
	                        break;
	                        
	                    case 68  : 
	                    	System.out.println("************Ladder************\n\n");
	                    	playerIndex = playerIndex + dice;
	                    	System.out.println(" You got the ladder on----> 68......! Your new position is---- "+playerIndex);	                    	
	                        break;
	                        
	                    case 77 : 
	                    	System.out.println("************Ladder************\n\n");
	                    	playerIndex = playerIndex + dice;
	                    	System.out.println(" You got the ladder on----> 77......! Your new position is---- "+playerIndex);	                    
	                        break; 
	                        
	                    case 86  : 
	                    	System.out.println("************Ladder************\n\n");
	                    	playerIndex = playerIndex + dice;
	                    	System.out.println(" You got the ladder on----> 86......! Your new position is---- "+playerIndex);
	                        break;
	                        
	                        
	                        
	                 //====================================Snake====================================
	                    
	                    case 17 : 
	                    	System.out.println("************Snake************\n\n");
	                    	playerIndex = playerIndex - dice;
	                    	System.out.println("Ooops...!Caught By the Snake.........! Your new position is---- "+playerIndex);
	                    	break;
	                    	
	                    case 54 : 
	                    	System.out.println("************Snake************\n\n");
	                    	playerIndex = playerIndex - dice;
	                    	System.out.println("Ooops...!Caught By the Snake.........! Your new position is---- "+playerIndex);
	                        break;
	                        
	                    case 62 : 
	                    	System.out.println("************Snake************\n\n");
	                    	playerIndex = playerIndex - dice;
	                    	System.out.println("Ooops...!Caught By the Snake.........! Your new position is---- "+playerIndex);
	                    	break;
	                    	
	                    case 64 : 
	                    	System.out.println("************Snake************\n\n");
	                    	playerIndex = playerIndex - dice;
	                    	System.out.println("Ooops...!Caught By the Snake.........!Your new position is---- "+playerIndex);
	                    	break;
	                    	
	                    case 98 : 
	                    	System.out.println("************Snake************\n\n");
	                    	playerIndex = playerIndex - dice;
	                    	System.out.println("Ooops...!Caught By the Snake.........!Your new position is---- "+playerIndex);
	                    	break;
	                    default : 	
	                    break;
	               }
	            }  
	            	else if (playerIndex>=100)
	        {
	         	playerIndex-=dice;
	         	System.out.println("************No Play************\n\n");
	         	System.out.println("Stays at same Position---> "+playerIndex+".");
	        }
	           
	  }
}
	       
	    public static void main(String[]args) 
	    {
	        Snake_Ladder Player1=new Snake_Ladder(); 
	        
	        Player1.snakeGame(); 
	        
	      
	     
	    }
	}
