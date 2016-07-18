/**
 *
 * @author vhlaw
 */
public class TwentyOne implements Game{

    public int numStick;
    private String first;
    private String second;
    private boolean playerOne;
    private boolean playerTwo;
    private int numTaken;

    public TwentyOne()
    {
        playerOne = true;
        playerTwo = false;
        numStick = 21;
    }

    public void rules()
    {
        System.out.println("The objective of the game is to pick up either 1 or 2 sticks during your turn, the person"
                + " who picks up the last stick loses. \n");
    }
    
    public boolean isValidMove(int numTaken)
    {
        return numTaken <= 2 && numTaken > 0;
    }

    public boolean checkWin(int numSticks)
    {
        return numStick == 1;
    }

    public void currentState()
    {
        System.out.println("There are " + numStick + " sticks.");
        System.out.println("How many sticks would you like to take? (1 or 2)");
    }

    public void executeMove(int num)
    {
        numStick -= num;
        if(numStick > 1)
        {   
                System.out.println("Next player's turn. \n");
        }
    }
}
