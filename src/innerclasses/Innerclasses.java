package innerclasses;

/**
 *
 * @author Marcin
 */
public class Innerclasses {
    public static void main(String[] args) 
    {
        A outer = new A();
        System.out.println(outer.getNum());
        A.B innerB1 = outer.new B();
        //A.B innerB2 = new B(); //error
        innerB1.changeNum(5);
        System.out.println(outer.getNum());
        A.B innerB3 = outer.createNewB();
        System.out.println(innerB3.hashCode());
        innerB3.changeNum(15);
        System.out.println(outer.getNum());
        //A.C innerC1 = outer.new C(); //error C is static class
        A.C innerC2 = new A.C();
    }
}

class A
{
    A()
    {
        System.out.println("Zewnętrzna klasa A");
    }
    class B
    {
        B()
        {
            System.out.println("Zagnieżdżona klasa B");
        }
        void changeNum(int _num) {
            num = _num;
        }
    }
    private int num;
    int getNum() {
        return this.num;
    }
      
    static class C 
    {
        
        C()
        {
            System.out.println("Zagnieżdżona klasa C");
        }
    }
    B createNewB()
    {
        B obj = new B();
        System.out.println(obj.hashCode());
        return obj;
    }
}