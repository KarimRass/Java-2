
package pkg;


public class Shark extends Fish{
    public Shark(String name, String scaleColor) {
        this.name = name;
        this.scaleColor = scaleColor;
    }
     public static void swim(){
        System.out.println("Shark swimming in the deep");
    }
     @Override
           public void performActivity() {
        swim();
    }
}
