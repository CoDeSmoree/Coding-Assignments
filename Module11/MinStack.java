package Module11;

import java.util.Stack;

class MinStack {

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    void push(int x){

        stack.push(x);

        if(minStack.isEmpty() || x <= minStack.peek())
            minStack.push(x);
    }

    void pop(){

        int removed = stack.pop();

        if(removed == minStack.peek())
            minStack.pop();
    }

    int top(){
        return stack.peek();
    }

    int getMin(){
        return minStack.peek();
    }

    public static void main(String[] args){

        MinStack s = new MinStack();

        s.push(3);
        s.push(5);
        s.push(2);
        s.push(1);

        System.out.println("Min = " + s.getMin());
    }
}
