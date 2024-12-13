import java.util.*;
public class InfixToPostfix{

   private String infixExpression;
   
   public InfixToPostfix(String i){
      this.infixExpression = i;
   }
   private int getPrecedence(char operator){
      if(operator == '+' || operator == '-') {
         return 1;
      } else if (operator == '*' || operator == '/') {
         return 2;
      } else {
         return -1;
      }
   }   
   public String Conversion(){
      Stack<Character> stack = new Stack<>();
      String result = "";
      
      for(int i = 0; i < infixExpression.length(); i++){
         char character = infixExpression.charAt(i);
         
         if(Character.isLetterOrDigit(character)){
            result += character;
         } else if(character == '('){
            stack.push(character);
         } else if(character == ')'){
               while(stack.peek() != '('){
                  result += stack.pop();
               }
               stack.pop();
         } else {
               while(!stack.isEmpty() && (getPrecedence(character) <= getPrecedence(stack.peek()))){
               result += stack.pop();
               }
               stack.push(character);
         }
      }
      while(!stack.isEmpty()){
         result += stack.pop();
      }
      return result;
   }
      
   public static void main(String[] args){
      InfixToPostfix itp = new InfixToPostfix("AX+B*C");
      System.out.println("Postfix Expression: " + itp.Conversion());
   }
}