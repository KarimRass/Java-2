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
public class FactoryTest {
    public static void main(String[] args) {
        Factory f = new Factory();
        A a1 = f.create(1);
        A a2 = f.create(2);
        B b1 = (B) a1;
        a1.m1();
        b1.m2();

    }
}
