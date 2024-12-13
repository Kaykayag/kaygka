import java.util.*;

  class Evaluation{
         private String postfix;
         
        public Evaluation(String p){
            postfix=p;
            }
                public double getResult(){
                    Stack<String> s = new Stack<>();
                    double ans=0;
                    
                    for(int i = 0 ; i<postfix.length();i++){
                            char ch = postfix.charAt(i);
                            
                            if (Character.isDigit(ch)){
                                s.push(ch + " ");
                                }else{
                                    
                                    double val2= Double.parseDouble(s.pop());
                                    double val1= Double.parseDouble(s.pop());
                                    
                                    switch(ch){
                                        
                                        case '*':
                                                    ans=val1*val2;
                                                    break;
                                         case '/':
                                                     ans= val1/val2;
                                                     break;
                                         case '+':
                                                     ans=val1+val2;
                                                     break;
                                          case '-':
                                                     ans=val1-val2;
                                                     break;
                                    }
                                        s.push(ans + " ");
                                        
                                }
                    }
                                        
                                        return Double.parseDouble(s.pop());
                                        
                                }
     
     public static void main (String[] args){
            Evaluation eval= new Evaluation ("32+");
            System.out.println("result: " + eval.getResult());
         
         
         }
         
                }