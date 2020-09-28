 
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class RPSDriver
{
    private static int tie;
    private static int win;
    private static int lose;

    public static void main(String[] args)
    {
        RPSMethods RPS = new RPSMethods();
        ImageIcon RPSPIC = new ImageIcon("RPSLS.png");
        JOptionPane.showMessageDialog(null, "Welcome to the Rock Paper Scissor Lizard Spock Game!"
        +"\n Click the button to begin and Good Luck!", null, JOptionPane.INFORMATION_MESSAGE, RPSPIC);
        
        Object[] options = {"Rock", "Paper" , "Scissor", "Spock", "Lizard", "Cancel"};
        int x = JOptionPane.showOptionDialog(null, "Rock Paper Scissor Lizard Spock:",
                "Choose one", JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]); 
        while(x<5) 
        {
            Random random = new Random();
            int rps = random.nextInt(5);
            if (rps == 0)
            {
                RPS.rock(x);
            }
            if (rps == 1)
            {
                RPS.paper(x);
            }
            if (rps == 2)
            {
                RPS.scissor(x);
            }
            if (rps == 3)
            {
                RPS.spock(x);
            }
            if (rps == 4)
            {
                RPS.lizzard(x);
            }
            System.out.println ("The computer played: "+options[rps]);
            x = JOptionPane.showOptionDialog(null, "Rull Paper Scissor sa-SHOO:",
                "Choose one", JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        }
        System.out.println (RPS.Summary());
    }
}
 