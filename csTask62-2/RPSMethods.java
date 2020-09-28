

public class RPSMethods
{
    private int tie, lose, win;
    private String summary;

    public RPSMethods()
    {

    }

    public void rock(int x)
    {
        if (x == 0)
        {
            System.out.println ("It's a tie");
            tie++;
        }
        else if ( x ==1)
        {
            System.out.println ("You won");
            lose++;
        }
        else if (x == 2)
        {
            System.out.println ("You lost");
            win++;
        }
        else if (x == 3)
        {
            System.out.println("You won");
            win++; 
        }
        else if (x == 4)
        {
            System.out.println("You lost");
            lose++; 
        }
    }

    public void scissor(int x)
    {

        if (x == 2)
        {   System.out.println ("It's a tie");
            tie++;
        }
        else if ( x ==1)
        {
            System.out.println ("You lost");
            lose++;
        }
        else if (x == 2)
        {
            System.out.println ("You won");
            win++;
        }
        else if (x == 3)
        {
            System.out.println("You won");
            win++; 
        }
        else if (x == 4)
        {
            System.out.println("You lost");
            lose++; 
        }
    }

    public void paper (int x)
    {
        if (x == 1)
        {
            System.out.println ("It's a tie");
            tie++;
        }
        else if ( x == 0)
        {
            System.out.println ("You lost");
            lose++;
        }
        else if (x == 2)
        {
            System.out.println ("You won");
            win++;
        }
        else if (x == 3)
        {
            System.out.println("You lost");
            lose++; 
        }
        else if (x == 4)
        {
            System.out.println("You won");
            win++; 
        }
    }

    public void spock(int x)
    {
        if (x == 3)
        {   System.out.println ("It's a tie");
            tie++;
        }
        else if ( x == 0)
        {
            System.out.println ("You lost");
            lose++;
        }
        else if (x == 1)
        {
            System.out.println ("You won");
            win++;
        }
        else if (x == 2)
        {
            System.out.println("You lost");
            lose++; 
        }
        else if (x == 4)
        {
            System.out.println("You won");
            win++; 
        }
    }

    public void lizzard (int x)
    {
        if (x == 4)
        {   System.out.println ("It's a tie");
            tie++;
        }
        else if ( x == 0)
        {
            System.out.println ("You won");
            win++;
        }
        else if (x == 1)
        {
            System.out.println ("You lost");
            lose++;
        }
        else if (x == 2)
        {
            System.out.println("You won");
            win++; 
        }
        else if (x == 3)
        {
            System.out.println("You lost");
            lose++; 
        }
    }

    public String Summary()
    {
        summary = "You won: " + win+" times"+"\nYou tie: " + tie+" times"
        +"\nYou lost: " + lose+" times";

        return summary;
    }
}
