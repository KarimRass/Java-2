
package pkg;


public class PolarBear extends Mammals {
         public PolarBear(String name, String SkinColor) {
        this.name = name;
        this.SkinColor = SkinColor;
    }
           public static void makeSound(){
        System.out.println("Bear Sounds");
    }
         @Override
           public void performActivity() {
     makeSound();
 }
}
