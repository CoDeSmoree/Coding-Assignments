package Module11;

import java.util.Stack;

class EvaluateRPN {

    public static int eval(String[] tokens){

        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){

            if(token.equals("+")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a+b);
            }
            else if(token.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a-b);
            }
            else if(token.equals("*")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a*b);
            }
            else if(token.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a/b);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args){

        String tokens[] = {"2","1","+","3","*"};

        System.out.println(eval(tokens));
    }
}