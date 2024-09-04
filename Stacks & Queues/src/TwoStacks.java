class TwoStacks < V > {
    private int arraySize;
    private V[] array;
    private int top1,top2;

    @SuppressWarnings("unchecked")
    public TwoStacks(int arraySize) {
        this.arraySize = arraySize;
        this.top1=-1;
        this.top2=arraySize;
        array = (V[]) new Object[arraySize]; //type casting Object[] to V[]
    }

    //insert at top of first stack
    public void push1(V value) {
        if(top1<top2-1){
            array[++top1]=value;
        }else{
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    //insert at top of second stack
    // Decrement top pointer and add element to stack 2 if space is available
    public void push2(V value) {
        if(top1<top2-1){
            array[--top2]=value;
        }else{
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }

    //remove and return value from top of first stack
    public V pop1() {
       if(top1>-1){
           return array[top1--];
       }else{
           System.out.println("Stack Underflow");
           System.exit(1);
           return null;
       }
    }

    //remove and return value from top of second stack
    public V pop2() {
        if (top2 < arraySize) {
            return array[top2++];
        } else {
            System.out.println("Stack Underflow");
            System.exit(1);
            return null; // This line won't be reached, but added to satisfy compiler
        }
    }


    public static void main(String args[]) {
        String[][] calls = {
                {"TwoStacks", "push1", "push2", "pop2"},
                {"TwoStacks", "push1", "pop1", "push2", "pop2"},
                {"TwoStacks", "push1", "push2", "push1", "push2", "pop1", "pop2", "pop1"},
                {"TwoStacks", "push2", "pop2", "push2", "push1"},
                {"TwoStacks", "push1", "push1", "push2", "pop1"},
        };

        Integer[][] inputs = {
                {5, 10, 15, null},
                {7, -4, null, -6, null},
                {5, 10, 20, 50, 30, null, null, null},
                {10, 4, null, 8, 10},
                {3, 10, 20, 30, null},
        };

        for (int i = 0; i < calls.length; i++) {
            System.out.println("Testcase " + (i + 1) + ":");
            TwoStacks<Integer> stackObj = new TwoStacks<>(inputs[i][0]);

            for (int j = 1; j < calls[i].length; j++) {
                switch (calls[i][j]) {
                    case "push1":
                        stackObj.push1(inputs[i][j]);
                        break;
                    case "push2":
                        stackObj.push2(inputs[i][j]);
                        break;
                    case "pop1":
                        System.out.println("\tpop1 returns " + stackObj.pop1());
                        break;
                    case "pop2":
                        System.out.println("\tpop2 returns " + stackObj.pop2());
                        break;
                }
            }
            System.out.println(new String(new char[75]).replace('\0', '-'));
        }
    }
}