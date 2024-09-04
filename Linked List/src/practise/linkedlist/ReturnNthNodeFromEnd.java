package practise.linkedlist;

import practise.LinkedListNode;

public class ReturnNthNodeFromEnd {

    public static void main(String[] args) {
        LinkedListNode<Integer> head=new LinkedListNode<>(45);
        head=  insertAtHead(head,35);
        head= insertAtHead(head,25);
        head= insertAtHead(head,15);
        head=insertAtHead(head,5);
        LinkedListNode<Integer> result=findNth(head,2);
        System.out.println(result.toString());
    }

    public static LinkedListNode<Integer> findNth(LinkedListNode<Integer> head, int n) {

        LinkedListNode<Integer> result = head;
        LinkedListNode<Integer> end = head;

        int count = 0;

        while (count < n) {
            end = end.next;
            count++;
        }

        while (end != null) {
            end = end.next;
            result = result.next;
            count++;
        }

        return result;
    }

    public static <T> LinkedListNode<T> insertAtHead(LinkedListNode<T> head, T data) {
        LinkedListNode<T> newNode = new LinkedListNode<>(data);
        newNode.next = head;
        return newNode;
    }
}
