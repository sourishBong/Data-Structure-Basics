package practise.linkedlist;

import practise.LinkedListNode;

public class LengthOfLinkedList {

    public static void main(String[] args) {

    }

    public static int length(LinkedListNode<Integer> head) {

        int count=1;

        if(head==null)
            return 0;

        LinkedListNode<Integer> curr=head;

        while(curr.next!=null){
            count++;
            curr=curr.next;
        }

        return count;
    }
}
