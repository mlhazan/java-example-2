package Collections;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 24, 2016
 */
import java.util.*;

public class ExpressionEvaluate_2 {

     public static void main(String[] args) {
          String expression = "([())]";
          if (evaluteExpression(expression) == 0) {
               System.out.print("Legal Expression");
          } else {
               System.out.print("Illegal Expression");
          }
     }

     public static int evaluteExpression(String expression) {
          Stack<Character> operatorStack = new Stack<>();
          expression = insertBlank(expression);
          System.out.print(expression + " = ");
          String[] tokens = expression.split(" ");

          for (int i = 0; i < tokens.length; i++) {
               if (tokens[i].length() == 0) // Blank space
               {
                    continue; // Back to the while loop to extract the next token
               } else {
                    switch (tokens[i].charAt(0)) {
                         case '(':                         
                         case '{':                            
                         case '[':
                              operatorStack.push(tokens[i].charAt(0));
                              continue;
                         case ')':
                              if (operatorStack.isEmpty()) {
                                   return -1;
                              }
                              if (operatorStack.peek() == '(') {
                                   operatorStack.pop();
                                   continue;
                              }else return -1;
                         case '}':
                              if (operatorStack.isEmpty()) {
                                   return -1;
                              }
                              if (operatorStack.peek() == '{') {
                                   operatorStack.pop();
                                   continue;
                              }else return -1;

                         case ']':
                              if (operatorStack.isEmpty()) {
                                   return -1;
                              }
                              if (operatorStack.peek() == '[') {
                                   operatorStack.pop();
                                   continue;
                              }else return -1;
                    }
               }
          }
          if (operatorStack.isEmpty()) {
               return 0;
          } else {
               return -1;
          }
     }
     public static void processAnOperator(
             Stack<Character> operatorStack) {
          operatorStack.pop();
     }
     public static String insertBlank(String s) {
          String result = "";
          for (int i = 0; i < s.length(); i++) {
               switch (s.charAt(i)) {
                    case '(':
                    case ')':
                    case '{':
                    case '}':
                    case '[':
                    case ']':
                         result += " " + s.charAt(i) + " ";
                         break;
               }
          }
          return result;
     }
}
