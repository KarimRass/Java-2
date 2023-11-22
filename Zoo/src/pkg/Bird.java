
package pkg;


public class Bird {
     String name;
     String color;
    public Bird() {
    
    }   
    
    public Bird(String name, String color) {
        this.name = name;
        this.color = color;}
        
    public static void fly()
    {
        System.out.println("bird flying");}
    
      public void performActivity(){
        fly();
      }
}
