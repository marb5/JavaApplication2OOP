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
    }
}

class Obj
{
    int n = 1;
}