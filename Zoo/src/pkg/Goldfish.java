
package pkg;


public class Goldfish extends Fish{
        public Goldfish(String name, String scaleColor) {
        this.name = name;
        this.scaleColor = scaleColor;
    }
     public static void swim(){
        System.out.println("Goldfish swimming in a bowl");
    }
           public void performActivity() {
        swim();
    }
}
