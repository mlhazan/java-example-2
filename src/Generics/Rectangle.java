
package Generics;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 22, 2016
 */
public class Rectangle extends GeometricObject {

     double a, b;
     public Rectangle(double a, double b){
         this.a = a;
         this.b = b;
     }
     @Override
     public double getArea(){
          return a * b ;
     }
}