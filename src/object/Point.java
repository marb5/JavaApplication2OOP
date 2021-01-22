/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author Marcin
 */
public class Point {
    private int x;
    private int y;
    
    Point()
    {
        
    }
    Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    int getX()
    {
        return x;
    }
    int getY()
    {
        return y;
    }
    @Override
    public boolean equals(Object o) 
    {
        //if its the same object (same addresses) objects are equal
        if (this == o)
            return true;
        //if compared object is null (doesn't exist)
        if (o == null)
            return false;
        //if they have other classes
        if (this.getClass() != o.getClass())
            return false;      
        
        return this.x == ((Point)o).x && this.y == ((Point)o).y;        
    }
    @Override
    public String toString() 
    {
        return getX() + " " + getY();
    }
}
