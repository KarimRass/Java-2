
package pkg;


public class Mammals {
    String name;
    String SkinColor;

    public Mammals() {
    }

    public Mammals(String name, String SkinColor) {
        this.name = name;
        this.SkinColor = SkinColor;
    }

    public String getName() {
        return name;
    }

    public String getSkinColor() {
        return SkinColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkinColor(String SkinColor) {
        this.SkinColor = SkinColor;
    }
          public static void makeSound(){
        System.out.println("Mammals Sounds");
    }
 public void performActivity() {
     makeSound();
 }
  


     
}
