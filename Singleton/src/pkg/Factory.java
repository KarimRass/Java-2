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
public class Factory {
        public A create(int type) {
            switch (type) {
                case 1:
                    return new B();
                case 2:
                    return new C();
                default:
                    return null;
            }
    }
}
