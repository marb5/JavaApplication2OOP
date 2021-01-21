/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2oop;

/**
 *
 * @author Marcin
 */
public class Client {
    public Client(String name)
    {
        this.name = name;       
        id = nextId;
        nextId++;
    }
    private String name;
    public int id = 0;
    public static int nextId = 1;
}