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
public class SingletonTest {
    public static void main(String[] args) {
         for (int i = 0; i < 10; i++) {
            Singleton r = Singleton.getInstance();
            System.out.print(i+1 + ") ");
            r.hello();
        }
    }
}
