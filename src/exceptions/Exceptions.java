package exceptions;

/**
 *
 * @author Marcin
 */
public class Exceptions {
    public static void main(String[] args) 
    {
        //String str = "I want to throw exception";
        String str = "I do not want to throw exception";
        int a = 20;
        int b = 2;
        
        try
        {
            System.out.println(a/b);
            System.out.println("Udało się podzielić!");
            if (str.equals("I want to throw exception"))
                      throw new MyException("Wyjątek został wyrzucony!");            
        }
        catch(MyException ex)
        {
            System.out.println("Wyjątek: " + ex.getMessage());
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Wyjątek: " + ex.getMessage());
        }
        
        try
        {
            System.out.println(a/b); 
        }
        catch(Exception ex)
        {
            System.out.println("Wyjątek: " + ex.getMessage());
        }
        finally
        {
            System.out.println("Zawsze zostanie napisane");
        }
        
        System.out.println("Koniec");
    }
}

class MyException extends Exception
{

    public MyException(String string) {
        super(string);
    }
    
}
