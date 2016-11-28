package Collections;

import Generics.GeometricObject;
import Generics.Rectangle;
import Generics.Circle;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetComparator {

     public static void main(String[] args) {
          Set<GeometricObject> set = new TreeSet<>(new GeomatricObjectComparator());
          
          set.add(new Rectangle(4, 5));
          set.add(new Circle(40));
          set.add(new Circle(40));
          set.add(new Rectangle(4, 1));

          for (GeometricObject element : set) {
               System.out.println("Area = " + element.getArea());
          }
     }

}
