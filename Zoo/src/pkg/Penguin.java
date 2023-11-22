
package pkg;


public class Penguin extends Bird {
       public Penguin(String name, String color) {
        this.name = name;
        this.color = color;
    }
     public static void fly(){
        System.out.println("Penguin cannot fly");
    }
         public void performActivity() {
        fly();
    }
}
