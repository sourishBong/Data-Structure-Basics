package create.queue.using.stacks;

class QueueWithStack {
    MyStack<Integer> mainStack;
    MyStack<Integer> tempStack;
    public QueueWithStack(int maxSize) {
        mainStack=new MyStack<>(maxSize);
        tempStack =new MyStack<>(maxSize);
    }

    public void enqueue(int value) {
        while(!mainStack.isEmpty()){
            tempStack.push(mainStack.pop());
        }
        mainStack.push(value);
        while(!tempStack.isEmpty()){
            mainStack.push(tempStack.pop());
        }
    }
    public int dequeue() {
        if(!mainStack.isEmpty()){
            return mainStack.pop();
        }
        return -1;
    }
}