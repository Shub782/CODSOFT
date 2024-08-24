import java.util.Random;
import java.util.Scanner;

/**
 * NumberGame
 */
public class NumberGame {

    public static void main(String[] args) {
      
      Random rand = new Random();
       //take a input from the userhfxqxwjq  
        Scanner Scanner = new Scanner(System.in);
                 
        boolean playAgain = true;
        while(playAgain){
        

        int randomNumber = rand.nextInt(100)+1;
        //System.out.println("The Random number is :"+randomNumber);
        System.out.println("Choose a random number between 1 to 100:");
        System.out.println("Guess the number within the 3 tries");
        
        
       int score = 0;
        int j=3;
        int i,guess;
   
       //looping a given code until he guesses correct number
          for(i=0;i<j;i++){
            System.out.println("Guess the number");
            guess = Scanner.nextInt();

             if(randomNumber==guess){
                System.out.println("Congratulations you have sucessfully guessed correct number");
                score++;
                
             break; 
            }else if(randomNumber>guess){
                System.out.println("Guessed number is too high");
                System.out.println("score:"+score);
             }else if(randomNumber<guess){
                System.out.println("Guessed number is too low");
                System.out.println("score:"+score);
             }
            }
              System.out.println("Do you want to play again(yes/no)");
              String playAgainInput = Scanner.next();
               playAgain = playAgainInput.equalsIgnoreCase("yes");
                             
         }    
            System.out.println("Thanks for playing I'm glad you liked it");
      }
         
   }


        
    
