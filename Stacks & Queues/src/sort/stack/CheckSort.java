package sort.stack;

class CheckSort {
    public static Stack < Integer > sortStack(Stack < Integer > stack) {
        Stack < Integer > tempStack = new Stack < > (stack.getMaxSize());
        while (!stack.isEmpty()) {
            Integer value = stack.pop();
            // If value is not none and larger, push it at the top of the temp_stack
            if (!tempStack.isEmpty() && value >= tempStack.top()) {
                tempStack.push(value);
            } else {
                while (!tempStack.isEmpty() && tempStack.top() > value)
                    stack.push(tempStack.pop());
                // Place value as the smallest element in tempStack
                tempStack.push(value);
            }
        }
        // Transfer from tempStack => stack
        while (!tempStack.isEmpty())
            stack.push(tempStack.pop());

        return stack;
    }

    public static void main(String[] args) {
        int[][] inputs = {
                {10, 30, 5, 20, 50},
                {-1, -2, -3, -4, -5, -6},
                {3, 2, -1},
                {12},
                {1, -2}
        };

        for (int[] stackValues : inputs) {
            Stack<Integer> stack = new Stack<>(stackValues.length);
            for (int value : stackValues) {
                stack.push(value);
            }
            System.out.print("Original Stack: [");
            for (int i = 0; i < stackValues.length; i++) {
                System.out.print(stackValues[i]);
                if (i < stackValues.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
            Stack<Integer> sortedStack = sortStack(stack);
            System.out.print("Sorted Stack: [");
            while (!sortedStack.isEmpty()) {
                System.out.print(sortedStack.pop());
                if (!sortedStack.isEmpty()) {
                    System.out.print(", ");
                }
            }
            System.out.println("]\n" + new String(new char[75]).replace('\0', '-'));
        }
    }
}