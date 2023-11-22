
package pkg;


public class Test {
    public static void main(String[] args) {
        Eagle eagle = new Eagle("Bald Eagle", "Brown");
        Penguin penguin = new Penguin("Emperor Penguin", "Black and White");
        Shark shark = new Shark("Great White Shark", "Gray");
        Goldfish goldfish = new Goldfish("Goldie", "Orange");
        PolarBear polar = new PolarBear("Polly", "white");
        Animal.performActivity(eagle);
        Animal.performActivity(penguin);
        Animal.performActivity(shark);
        Animal.performActivity(goldfish);
        Animal.performActivity(polar);
    }
}
