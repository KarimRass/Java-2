/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg;

/**
 *
 * @author ASUS
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setId(1023);
        std1.setName("Mahmoud ");
        std1.setGpa(2.8);
        
        //////////////////////////////////////////////////////////////////////////
        
        
        Student std2 = new Student(1501, "Omar", 3.4);
        
        
        //////////////////////////////////////////////////////////////////////////
        
        Student std3 = new Student();
        std3.withId(0123).withName("Karim").withGpa(3.9);
        std2.withEmail("Karim@gmail.com");
        std3.getId();
    }
}
