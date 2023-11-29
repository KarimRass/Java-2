
package pkg;

import java.util.Scanner;


public class Facade {
    Scanner read = new Scanner(System.in);
    
    
    private Subsystem1 subsys1 =new Subsystem1();
    private Subsystem2 subsys2 =new Subsystem2();   
    
        public void setValue() {
        System.out.println("Choose a method to initialize in order :");
        System.out.println("1. Method1 , Method2" );
        System.out.println("2. Method2 , Method1");
        
        
        int choice = read.nextInt();
        
         switch (choice) {
            case 1:
                subsys1.Operation1();
                subsys2.Operation2();
                break;
            case 2:
                subsys2.Operation2();
                subsys1.Operation1();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
        
        
    
    public void operate(){
        System.out.println("Face is coordinatin the subsystem");
        subsys1.Operation1();
        subsys2.Operation2();
    }
}
