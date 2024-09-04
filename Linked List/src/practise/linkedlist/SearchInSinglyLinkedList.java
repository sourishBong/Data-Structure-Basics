package practise.linkedlist;

import practise.LinkedListNode;

public class SearchInSinglyLinkedList {

    public static void main(String[] args) {
        LinkedListNode<Integer> head =new LinkedListNode<Integer>(3);
        int value=3;
        boolean answer=searchNode(head,value);
        System.out.println(answer);
    }

    private static boolean searchNode(LinkedListNode<Integer> head, int value) {

        //base case
        if(head==null)
            return false;

        if(head.data==value)
            return true;

        return searchNode(head.next,value);

    }

    public static boolean searchNodeIterative(LinkedListNode<Integer> head, int value) {

       if(head==null)
           return false;
       if(head.next==null){
           if(head.data==value)
               return true;
           else
               return false;
       }

        LinkedListNode<Integer> current=head;

        while(current.next!=null){
            if(current.data==value)
                return true;
            current=current.next;
        }
        return false;
    }
}
