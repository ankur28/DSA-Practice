package String;

import java.util.Stack;

public class RemoveOuterParantheses {
    public static void main(String[] args) {
            String s= "([]}";

        Stack<Character> stack = new Stack<>();

        for( char c : s.toCharArray()){
            switch(c){
                case '(':
                case '[':
                case '{':
                {
                    stack.push(c);
                    break;
                }
                case ')':{
                    if(stack.isEmpty() || stack.pop() != '(')
                        System.out.println(false);

                    break;
                }
                case ']':{
                    if(stack.isEmpty() || stack.pop() != '[')
                        System.out.println(false);

                    break;
                }
                case '}':{
                    if(stack.isEmpty() || stack.pop() != '{')
                        System.out.println(false);

                    break;
                }
            }
        }

        System.out.println(stack.isEmpty());


    }

}
