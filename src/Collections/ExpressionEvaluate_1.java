package Collections;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 24, 2016
 */
import java.util.*;

public class ExpressionEvaluate_1 {

     public static void main(String[] args) {
          String expression = "(1+(2*3+10-1)-10) * 2";

          System.out.print(evaluteExpression(expression));
     }

     /**
      * Evaluate an expression
      *
      * @param expression
      * @return
      */
     public static int evaluteExpression(String expression) {
          // Create operandStack to store operands
          Stack<Integer> operandStack = new Stack<>();

          // Create operatorStack to store operators
          Stack<Character> operatorStack = new Stack<>();

          // Insert blanks around (, ), +, -, /, and *
          expression = insertBlank(expression);
          System.out.print(expression + " = ");
          // Extract operands and operators
          String[] tokens = expression.split(" ");

          // Phase 1: Scan tokens
          for (int i = 0; i < tokens.length; i++) {
               if (tokens[i].length() == 0) // Blank space
               {
                    continue; // Back to the while loop to extract the next token
               } else if (tokens[i].charAt(0) == '+' || tokens[i].charAt(0) == '-') {
                    // Process all +, -, *, / in the top of the operator stack 
                    while (!operatorStack.isEmpty()
                            && (operatorStack.peek() == '+'
                            || operatorStack.peek() == '-'
                            || operatorStack.peek() == '*'
                            || operatorStack.peek() == '/')) {
                         processAnOperator(operandStack, operatorStack);
                    }

                    // Push the + or - operator into the operator stack
                    operatorStack.push(tokens[i].charAt(0));
               } else if (tokens[i].charAt(0) == '*' || tokens[i].charAt(0) == '/') {
                    // Process all *, / in the top of the operator stack 
                    while (!operatorStack.isEmpty()
                            && (operatorStack.peek() == '*'
                            || operatorStack.peek() == '/')) {
                         processAnOperator(operandStack, operatorStack);
                    }

                    // Push the * or / operator into the operator stack
                    operatorStack.push(tokens[i].charAt(0));
               } else if (tokens[i].trim().charAt(0) == '(') {
                    operatorStack.push('('); // Push '(' to stack
               } else if (tokens[i].trim().charAt(0) == ')') {
                    // Process all the operators in the stack until seeing '('

                    processAnOperator(operandStack, operatorStack);
                    operatorStack.pop(); // Pop the '(' symbol from the stack
               } else { // An operand scanned
                    // Push an operand to the stack
                    operandStack.push(new Integer(tokens[i]));
               }
          }

          // Phase 2: process all the remaining operators in the stack 
          // Return the result
          while (!operatorStack.isEmpty()) {
               processAnOperator(operandStack, operatorStack);
          }
          return operandStack.pop();
     }

     /**
      * Process one operator: Take an operator from operatorStack and apply it
      * on the operands in the operandStack
      *
      * @param operandStack
      * @param operatorStack
      */
     public static void processAnOperator(
             Stack<Integer> operandStack, Stack<Character> operatorStack) {
          char op = operatorStack.pop();
          int op1 = operandStack.pop();
          int op2 = operandStack.pop();
          if (op == '+') {
               operandStack.push(op2 + op1);
          } else if (op == '-') {
               operandStack.push(op2 - op1);
          } else if (op == '*') {
               operandStack.push(op2 * op1);
          } else if (op == '/') {
               operandStack.push(op2 / op1);
          }
     }

     public static String insertBlank(String s) {
          String result = "";
          for (int i = 0; i < s.length(); i++) {
               switch (s.charAt(i)) {
                    case '(':
                    case ')':
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                         result += " " + s.charAt(i) + " ";
                         break;
                    default:
                         result += s.charAt(i);
                         break;
               }
          }
          return result;
     }
}
