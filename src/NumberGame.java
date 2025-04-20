import java.util.Scanner;
public class NumberGame
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int chances=8;
		int finals=0;
		boolean playAgain=true;
	    System.out.println("welcome Buddy! Let Start the Game");
	    System.out.println("Hey Buddy you have about  "+chances+  "  to win the game");
	    
	    while(playAgain){
	        int rand = getrand(1,100);
	        boolean guess=false;
	       
	   for(int i=0;i<chances;i++){
	    System.out.println("chance "+(i+1)+" Enter your guess:");
	    int user=sc.nextInt();
	            
	   if(user == rand){
	      guess = true;
	      finals += 1;
	      System.out.println("You Won it😍🎉");
	       break;
	    }
	   else if(user>rand){
	       System.out.println("Too High!!!! Try a smaller Number");
	   }
	   else{
	        System.out.println("Too Low!!!! Try a Larger Number");
	   }
	            
	 }
	            
	  if(!guess){
	            System.out.println("Ohhhh Sorry You Lost the Chance.The number is"+rand);
	            
	            
	        }
	        System.out.println("Do You wanna Play again(y/n)");
	        String pA=sc.next();
	        playAgain=pA.equalsIgnoreCase("y");
	            
	    }
	    System.out.println("That's it.........Hope you enjoy the Game");
	    System.out.println("Here is your Score"+finals);
	    sc.close();
	}
	    public static int getrand(int min,int max){
	        return (int)(Math.random()*(max-min+1)+min);
	    }
	            
	            
	}
