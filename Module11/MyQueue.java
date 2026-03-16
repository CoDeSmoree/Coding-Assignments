package Module11;

import java.util.Stack;

class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    void push(int x){
        stack1.push(x);
    }

    int pop(){

        if(stack2.isEmpty()){

            while(!stack1.isEmpty())
                stack2.push(stack1.pop());
        }

        return stack2.pop();
    }

    int peek(){

        if(stack2.isEmpty()){

            while(!stack1.isEmpty())
                stack2.push(stack1.pop());
        }

        return stack2.peek();
    }

    public static void main(String[] args){

        MyQueue q = new MyQueue();

        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println(q.pop());
    }
}
