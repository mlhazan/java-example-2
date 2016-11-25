package Generics;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 22, 2016
 */
public class GenericSort {

     public static void main(String[] args) {
          Integer[] intArray = {2, 4, 3};
          Double[] doubleArray = {3.4, 1.3, -22.1};
          Character[] charArray = {'a', 'J', 'r'};
          String[] stringArray = {"Tom", "Susan", "Katty"};

          sort(intArray);
          sort(doubleArray);
          sort(charArray);
          sort(stringArray);

          System.out.print("Sorted Integer objects: ");
          printList(intArray);
          System.out.print("Sorted Double objects: ");
          printList(doubleArray);
          System.out.print("Sorted Character objects: ");
          printList(charArray);
          System.out.print("Sorted String objects: ");
          printList(stringArray);
     }

     public static <E extends Comparable<E>> void sort(E[] list) {
          E currentMin;

          for (int i = 0; i < list.length-1; i++) {
               currentMin = list[i];

               for (int j = i + 1; j < list.length ; j++) {
                    if (currentMin.compareTo(list[j]) > 0) {

                         currentMin = list[j];
                         E temp = list[i];
                         list[i] = list[j];
                         list[j] = temp;
                    }
               }
          }
     }

     public static <E extends Object>void printList(E[] list) {
          for (E list1 : list) {
               System.out.print(list1 + " ");
          }
          System.out.println();
     }
}