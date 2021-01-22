package reference;

/**
 *
 * @author Marcin
 */
public class Reference {
    public static void main(String[] args) {
        int a = 10;
        int b = a; //copy a
        b = 15;
        System.out.println(a);

        Obj x = new Obj();
        Obj y = x; //reference to same obj x
        y.n = 5;
        System.out.println(x.n);
        
        a = changeValue(a);
        System.out.println(a);
        
        changeValue(x);
        System.out.println(x.n);
        
        String name1 = new String("Marcin");
        String name2 = new String("Marcin");
        
        if (name1.equals(name2))
            System.out.println("equals");
        else
            System.out.println("not equals");
    }
    
    static int changeValue(int a) {
        a++;
        return a;
    }
    static void changeValue(Obj o) {
        o.n++;
    }
}

class Obj {
    int n = 1;
}