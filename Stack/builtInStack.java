import java.util.*;

class builtInStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        //stack.add(8);
        //stack.remove(5);
        stack.peek();
        stack.pop();
        stack.push(3);

        System.out.print(stack.pop());
    }
}