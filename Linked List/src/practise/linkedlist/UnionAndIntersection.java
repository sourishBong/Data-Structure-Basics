package practise.linkedlist;

import practise.LinkedListNode;

public class UnionAndIntersection {

    public static void main(String[] args) {
        
    }

    // performs union of two lists
    public static LinkedListNode<Integer> union(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {

        if(head1==null)
            return head2;
        if(head2==null)
            return head1;

        LinkedListNode<Integer> current=head1;

        while(current.next!=null){
            current=current.next;
        }

        current.next=head2;

        LinkedListNode<Integer> outer=head1;

        while(outer!=null){
            LinkedListNode<Integer> inner=outer;
            while(inner!=null && inner.next!=null){
                if(outer.data==inner.next.data){
                    inner.next=inner.next.next;
                }else{
                    inner=inner.next;
                }
            }
            outer=outer.next;
        }

        return head1;
    }

    // performs intersection between list
    public static LinkedListNode<Integer> intersection(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {

        LinkedListNode<Integer> result = null;
        LinkedListNode<Integer> current1 = head1;

        // Iterate over each node in the first list
        while (current1 != null) {
            LinkedListNode<Integer> current2 = head2;
            // Check if the current node in the first list exists in the second list
            while (current2 != null) {
                if (current1.data == current2.data && (!existsInResult(current1.data, result))) {
                    result = insertAtHead(result, current1.data);
                }
                current2 = current2.next;
            }
            current1 = current1.next;
        }
        return result;
    }

    // Function to check if a data value exists in the result list
    public static <T> boolean existsInResult(T data, LinkedListNode<T> head) {
        LinkedListNode<T> current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Helper function to insert a new node at the head of a list
    public static <T> LinkedListNode<T> insertAtHead(LinkedListNode<T> head, T data) {
        LinkedListNode<T> newNode = new LinkedListNode<>(data);
        newNode.next = head;
        return newNode;
    }
}
