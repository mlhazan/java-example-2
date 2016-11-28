package Collections;

import Generics.GeometricObject;
import java.util.Comparator;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 23, 2016
 */
public class GeomatricObjectComparator implements Comparator<GeometricObject>, java.io.Serializable {

     @Override
     public int compare(GeometricObject o1, GeometricObject o2) {
          double area1 = o1.getArea();
          double area2 = o2.getArea();
          if (area1 < area2) {
               return -1;
          } else if (area1 == area2) {
               return 0;
          } else {
               return 1;
          }
     }

}
