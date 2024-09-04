package practise.linkedlist;

import practise.LinkedListNode;

public class FindMiddleOfLinkedList {

    public static void main(String[] args) {

    }

    public static LinkedListNode<Integer> findMiddle(LinkedListNode<Integer> head) {

        LinkedListNode<Integer> slow=head;
        LinkedListNode<Integer> fast=head;
        LinkedListNode<Integer> curr=head;
        int count=1;

        while(curr.next!=null){
            count++;
            curr=curr.next;
        }

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        if(count%2==0){
            slow=slow.next;
        }
        return slow;
    }
}
