
package Collections;
import Generics.*;
import java.util.Comparator;
/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 23, 2016
 */
public class TestComparator {
     public static void main(String[] args) {
          GeometricObject g1 = new Rectangle(5, 5);
          GeometricObject g2 = new Circle(5);
          
          //GeometricObject g = max (g1, g2);
          GeometricObject g = max (g1, g2, new GeomatricObjectComparator());
          System.out.print("The Area of the larger object is: " + g.getArea());
     }
     //private static GeometricObject max(GeometricObject g1, GeometricObject g2) {
     private static GeometricObject max(GeometricObject g1, GeometricObject g2, Comparator c) {
        //GeomatricObjectComparator c = new GeomatricObjectComparator();
          if(c.compare(g1, g2) > 0)
              return g1;
         else return g2;
     }
}
