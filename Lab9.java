import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vhlaw
 */
public class Lab9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please choose an option: \n"
                + "1. Twenty One Sticks\n"
                + "2. Guessing Game");
        int ans = scan.nextInt();

        Game myGame;
        
        if(ans == 1)
        {
            myGame = new TwentyOne();
        }
        else
        {
            myGame = new GuessingGame();
        }
        
        myGame.rules();
        
        while(true)
        {
            myGame.currentState();
            int num = scan.nextInt();
            
            boolean valid = myGame.isValidMove(num);
            if(valid)
            {
                myGame.executeMove(num);
                boolean win = myGame.checkWin(num);
                
                if(win)
                {
                    System.out.println("You Won!");
                    break;
                }
            }
                
            else
            {
                System.out.println("Invalid Move!");
            }
        }
    } 
}        
