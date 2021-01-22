package anonymousclasses;

/**
 *
 * @author Marcin
 */
public class AnonymousClasses {
    public static void main(String[] args) 
    {
        LeftClick act1 = () -> {
            System.out.println("Klasa anonimowa lewy przycisk myszy");
        };
        
        //RightClick act2 = (a, b) -> a + b;
        
        RightClick act2 = (a, b) -> {
            System.out.println("Klasa anonimowa prawy przycisk myszy");
            return a + b;
        };
                
        Button p = new Button();
        
        p.addActionLeft(act1);
        
        int result = p.addActionRight(3, 7, act2);
        
        System.out.println(result);
     
    }
}

interface LeftClick {
    void action();
}

interface RightClick {
    int action(int a, int b);
}
 
class Button {
    void addActionLeft(LeftClick act)
    {
        act.action();
    }
    
    int addActionRight(int a, int b, RightClick act)
    {
        return act.action(a, b);
    } 
}
