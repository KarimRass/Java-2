
package pkg;

public class Eagle extends Bird {
      public Eagle(String name, String color) {
        
        this.name = name;
        this.color = color;
    }
    public static void fly(){
        System.out.println("Eagle flying high");
    }
        public void performActivity() {
        fly();
    }
}
