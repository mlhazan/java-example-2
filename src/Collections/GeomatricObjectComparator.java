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
          if (o1.getArea() < o2.getArea()) {
               return -1;
          } else if (o1.getArea() < o2.getArea()) {
               return 1;
          } else {
               return 0;
          }
     }

}
