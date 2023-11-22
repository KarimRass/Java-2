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
public class Test {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Bald Eagle", "Brown");
        Penguin penguin = new Penguin("Emperor Penguin", "Black and White");
        Shark shark = new Shark("Great White Shark", "Gray");
        Goldfish goldfish = new Goldfish("Goldie", "Orange");
        PolarBear polar = new PolarBear("Polly", "white");
        Polymporphism.performActivity(eagle);
        Polymporphism.performActivity(penguin);
        Polymporphism.performActivity(shark);
        Polymporphism.performActivity(goldfish);
        Polymporphism.performActivity(polar);
    }
}
