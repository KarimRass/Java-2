
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

    public void setName(String name) {
        this.name = name;
    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    public String getName() {
        return name;
    }

    public String getScaleColor() {
        return scaleColor;
    }
     
    
    public static void swim(){
        System.out.println("Fish swimming");
    }
      public void performActivity() {
        swim();
    }
}
