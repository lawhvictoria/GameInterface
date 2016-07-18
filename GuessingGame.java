import java.util.Random;

/**
 *
 * @author vhlaw
 */
public class GuessingGame implements Game{
    
    private int randomNum;
    
    public GuessingGame()
    {
        Random rand = new Random();
        randomNum = rand.nextInt((30 - 1) + 1) + 1;
    }

    public void rules()
    {
        System.out.println("Each play takes a turn trying to guess the number. The number is between 1 and 30. \n");
    }

    public boolean isValidMove(int num)
    {
        return(num > 0 && num <= 30);
    }

    public boolean checkWin(int guess)
    {
        return(guess == randomNum);
    }
    
    public void currentState()
    {
//        System.out.println(randomNum);
        System.out.println("Guess a number between 1 and 30. ");
        
    }

    public void executeMove(int guess)
    {
        if(guess > randomNum)
        {
            System.out.println("You are too high!");
            System.out.println("Next Player's turn!");
        }
        else if(guess < randomNum)
        {
            System.out.println("You are too low!");
            System.out.println("Next Player's turn!");
        }
    }
}

