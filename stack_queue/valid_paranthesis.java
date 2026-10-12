package stack_queue;

import java.util.Stack;

public class valid_paranthesis {
    public boolean validparanthses(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);

          //opening brackets
          if(ch=='(' || ch=='{' || ch=='['){
            stack.push(ch);
          }
          else{
            if(stack.isEmpty()){
                return false;
            }
            char top=stack.pop();
          if(ch=='(' &&  top!=')'){
            return false;
          }
             
          if(ch=='{' &&  top!='}'){
            return false;
          }
             
          if(ch=='[' &&  top!=']'){
            return false;
          }
          }
        }
        return stack.isEmpty();
    }
}
