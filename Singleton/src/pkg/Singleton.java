/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

/**
 *
 * @author ASUS
 */
public class Singleton {
       private static Singleton instance;

    private Singleton() {
        System.out.println("New object has been created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void hello() {
        System.out.println("Hello from singleton");
    }
}
