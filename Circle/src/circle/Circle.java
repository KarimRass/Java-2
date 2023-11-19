/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

/**
 *
 * @author ASUS
 */
public class Circle {
    int radius;

       public Double getRound(){
        double round;
        round=3.142*(radius)*2;
        System.out.println("Round = "+round);
        return round;
    }
    public double getArea(){
        double area;
       area=3.142*(radius)*(radius);
        System.out.println("Area = "+ area);
        return area;
    }
    
}
