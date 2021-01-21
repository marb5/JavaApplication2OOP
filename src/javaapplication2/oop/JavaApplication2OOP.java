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