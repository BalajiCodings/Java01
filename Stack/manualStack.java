class manualStack {
    int top = -1;
    int[] arr = new int[100];

    void push(int val) {
        if(top == arr.length - 1) {
            return ;
        }
        arr[++top] = val;
    }
    int pop() {
        if(top == -1) {
            return -1;
        }
        int x = arr[top];
        top--;

        return x;
    }

    int peek() {
        if(isEmpty()) {
            return -1;
        }
        return arr[top];

    }

    int size() {
        if(isEmpty()) {
            return -1;
        }
        return top + 1;
    }

    boolean isEmpty() {
        return top == -1;
    }


    public static void main(String[] args) {
        manualStack stack = new manualStack();
        stack.push(1);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        stack.push(10);
        stack.pop();

        System.out.print(stack.pop());
    }
}