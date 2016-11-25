
package Generics;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 22, 2016
 */
public class Circle extends GeometricObject {
  double a;
     public Circle(double a){
           this.a = a;
     }
  @Override
     public double getArea(){
          return 3.14* a *a ;
     }
}