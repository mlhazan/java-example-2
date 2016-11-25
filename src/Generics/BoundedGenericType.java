
package Generics;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 22, 2016
 */
public class BoundedGenericType {
     public static void main(String[] args) {
          Rectangle rec = new Rectangle(2,2);
          Circle cir = new Circle (3.0);
          
          System.out.println("Equal Are: "+ equalArea(rec,cir));
     }

     private static <E extends GeometricObject>boolean equalArea(E rec, E cir) {
         return rec.getArea() == cir.getArea();
     }
}

    