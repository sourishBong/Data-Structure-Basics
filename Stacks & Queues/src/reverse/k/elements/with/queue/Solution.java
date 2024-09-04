package reverse.k.elements.with.queue;

class Solution {
    public static void main(String[] args) {

    }
    public static MyQueue<Integer> reverseK(MyQueue<Integer> queue, int k) {
        MyStack<Integer> myStack=new MyStack<>();
        for(int i=0;i<k;i++){
            myStack.push(queue.dequeue());
        }
        while(!myStack.isEmpty()){
            queue.enqueue(myStack.pop());
        }

        for(int i=0;i< queue.size()-k;i++){
            queue.enqueue(queue.dequeue());
        }
        return queue;
    }
}