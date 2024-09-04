package practise.linkedlist;

import practise.LinkedListNode;

public class InsertionAtTail {

    public static void main(String[] args) {
        LinkedListNode <Integer> head=new LinkedListNode<>(5);
        int value=10;
        LinkedListNode <Integer> tail=insertAtTail(head,value);
        System.out.println(tail.toString());
    }

    public static LinkedListNode<Integer> insertAtTail(LinkedListNode <Integer> head, int value) {

        LinkedListNode<Integer> node=new LinkedListNode<>(value);
        // New node will become the head node if there
        // are no elements in the linked list
        if (head == null) {
            head = node;
        }else{
            LinkedListNode<Integer> curr=head;

            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=node;
        }
        return head;
    }
}
