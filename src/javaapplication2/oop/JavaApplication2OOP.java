package javaapplication2.oop;

/**
 *
 * @author Marcin
 */
public class JavaApplication2OOP {

    public static void main(String[] args) {
        Monitor firstMonitor = new Monitor();
        firstMonitor.width = 1000;
        firstMonitor.height = 800;
        
        System.out.println(firstMonitor.width);
        System.out.println(firstMonitor.height);
        
        Point p1 = new Point();
        Point p2 = new Point(10,20);
        
        System.out.println("p1:");
        p1.showCoordinates();
        System.out.println("p2:");
        p2.showCoordinates();
        
        NewClass test = new NewClass();
        
        System.out.println(test.add(2, 3));
        System.out.println(test.add(2.1, 3.4));
        
        MyMath newMath = new MyMath();
        System.out.println(MyMath.add(3, 1));
        System.out.println(MyMath.PI);
        
        Client a = new Client("Marcin");
        Client b = new Client("Ryszard");
        System.out.println(a.id);
        System.out.println(b.id);
        System.out.println(Client.nextId);
    }
    
}

class Monitor {
    int width;
    int height;
    
    void turnOn() {
        
    }
    void turnOff() {
        
    }
}

class MyMath
{
    static final double PI = 3.14; //unchangeable final value
    static double add(double a, double b)
    {
        return a + b;
    }
}

class Client
{
    Client(String name)
    {
        this.name = name;       
        id = nextId;
        nextId++;
    }
    String name;
    int id = 0;
    static int nextId = 1;
}