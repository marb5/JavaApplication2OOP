package javaapplication2.oop;

/**
 *
 * @author Marcin
 */
public class Point {
    Point()
    {
        System.out.println("Konstruktor domyślny");
        
        x = 0;
        y = 0;
    }
    Point(int _x, int _y)
    {   
        System.out.println("Konstruktor z dwoma parametrami");

        this.x = _x;
        this.y = _y;
    }
    void showCoordinates() {
        System.out.println("x: " + this.x + " y: " + this.y);
    }
    
    int x;
    int y;
}
