/**
 *
 * @author vhlaw
 */
public interface Game {
    
    public boolean isValidMove(int num);
    
    public void executeMove(int num);
    
    public boolean checkWin(int num);
    
    public void currentState();
    
    public void rules();
}
