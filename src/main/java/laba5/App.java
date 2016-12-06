package laba5;

public class App {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()) {
            Integer stack1 = stack.pop();
            System.out.println(stack1);
            stack2.push(stack1);
        }

        while(!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }
    }
}
