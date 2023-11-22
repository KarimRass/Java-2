
package pkg;


public class Bird {
     String name;
     String color;

    ///////////////////
    public Bird() {
    }

    ///////////////////
    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    ///////////////////
    public String getName() {
        return name;
    }

    ///////////////////
    public void setName(String name) {
        this.name = name;
    }

    ///////////////////
    public String getColor() {
        return color;
    }

    ///////////////////
    public void setColor(String color) {
        this.color = color;
    }
    ///////////////////
    public static void fly(){
        System.out.println("bird flying");
    }
    ///////////////////
      public void performActivity() {
        fly();
    }
}
