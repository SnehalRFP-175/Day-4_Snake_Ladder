package Snake_Ladder.BridgeLabz;
/*Added Uc3
 * Checks for the option No Play,Snakes or Ladder */

import java.util.Random;
public class Snake_Ladder 
{
	    private static int playerIndex=0;
	    private static int dice;  
		void snakeGame() 
	    {
			
	                
	        //RANDOM
	        Random r = new Random();
	        
	        System.out.println("Player at Zero Position-->"+playerIndex);
	
	            dice = r.nextInt(6);
	           
	            if(dice == 0)
	            {	
	                dice++;  
	            }
	            System.out.println("The number on the die is "+dice);
	            
	            playerIndex += dice;
	            System.out.println("Player Position---> "+playerIndex+".");
	            if (playerIndex>=100)
	 	         {
	 	         		playerIndex -= dice;
	 	         		System.out.println("************No Play************\n\n");
	 	         		System.out.println("Stays at same Position---> "+playerIndex+".");
	 	         }
	            	
	          
	            	switch(playerIndex)
	                {
	                   
	              //====================================Ladder====================================
	                    case 4  :
	                    	System.out.println("************Ladder************\n\n");
	                    	System.out.println(" You got the ladder on----> 4......! Your new position is---- "+playerIndex);
	                    	playerIndex = playerIndex + dice;
	                        break;
	                    case 57  : 
	                    	System.out.println("************Ladder************\n\n");
	                    	System.out.println(" You got the ladder on----> 57......! Your new position is---- "+playerIndex);
	                    	playerIndex = playerIndex + dice;
	                        break;
	                    case 68  : 
	                    	System.out.println("************Ladder************\n\n");
	                    	System.out.println(" You got the ladder on----> 68......! Your new position is---- "+playerIndex);
	                    	playerIndex = playerIndex + dice;
	                        break;
	                    case 77 : 
	                    	System.out.println("************Ladder************\n\n");
	                    	System.out.println(" You got the ladder on----> 77......! Your new position is---- "+playerIndex);
	                    	playerIndex = playerIndex + dice;
	                        break;    
	                    case 86  : 
	                    	System.out.println("************Ladder************\n\n");
	                    	System.out.println(" You got the ladder on----> 86......! Your new position is---- "+playerIndex);
	                    	playerIndex = playerIndex + dice;
	                        break;
	                        
	                        
	                        
	                 //====================================Snake====================================
	                    
	                    case 10 : 
	                    	System.out.println("************Snake************\n\n");
	                    	System.out.println("Ooops...!Caught By the Snake.........! Your new position is---- "+playerIndex);
	                    	playerIndex = playerIndex - dice;
	                        break;
	                    case 54 : 
	                    	System.out.println("************Snake************\n\n");
	                    	System.out.println("Ooops...!Caught By the Snake.........! Your new position is---- "+playerIndex);
	                    	playerIndex = playerIndex - dice;
	                        break;
	                    case 62 : 
	                    	System.out.println("************Snake************\n\n");
	                    	System.out.println("Ooops...!Caught By the Snake.........! Your new position is---- "+playerIndex);
	                    	playerIndex = playerIndex - dice;
	                        break;
	                    case 64 : 
	                    	System.out.println("************Snake************\n\n");
	                    	System.out.println("Ooops...!Caught By the Snake.........!Your new position is---- "+playerIndex);
	                    	playerIndex = playerIndex - dice;
	                        break;
	                    case 98 : 
	                    	System.out.println("************Snake************\n\n");
	                    	System.out.println("Ooops...!Caught By the Snake.........!Your new position is---- "+playerIndex);
	                    	playerIndex = playerIndex - dice;
	                        break;
	                    default : 	
	                    break;
	               }        
	   }
	       
	    public static void main(String[]args) 
	    {
	    	System.out.println("*************WELCOME TO SNAKES AND LADDERS*************\n\n");
	    	
	    	Snake_Ladder Player1=new Snake_Ladder(); 
	        
	        Player1.snakeGame(); 
	        
	      
	     
	    }
	}
