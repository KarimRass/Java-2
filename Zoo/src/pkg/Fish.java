
package pkg;


public class Fish {
     String name;
     String scaleColor;

    public Fish() {
    }

    public Fish(String name, String scaleColor) {
        this.name = name;
        this.scaleColor = scaleColor;
    }
    public static void swim(){
        System.out.println("Fish swimming");
    }
      public void performActivity() {
        swim();
    }
}
