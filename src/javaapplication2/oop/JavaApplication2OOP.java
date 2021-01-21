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
        
        System.out.println("p1.x " + p1.x);
        System.out.println("p1.y " + p1.y);
        
        System.out.println("p2.x " + p2.x);
        System.out.println("p2.y " + p2.y);
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