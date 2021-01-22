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
public class Main {
    public static void main(String[] args) 
    {
        Point point = new Point(1,2);
        System.out.println(point.getClass());
        
        Object[] punkty = new Point[3];
        punkty[0] = new Point(1, 2);
        punkty[1] = new Point(2, 2);
        punkty[2] = new Point(1, 2);
        
        System.out.println(punkty[0].equals(punkty[1]));
        System.out.println(punkty[0].equals(punkty[2]));
        System.out.println(punkty[1].equals(punkty[2]));
        
        for(int i = 0; i < punkty.length; i++)
        {
            System.out.println(punkty[i]);
        }
    }
}
