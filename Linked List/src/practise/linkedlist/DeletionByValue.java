package practise.linkedlist;

import practise.LinkedListNode;

public class DeletionByValue {

    public static void main(String[] args) {

    }

    public boolean deleteByValue(LinkedListNode<Integer> head, int value) {

        LinkedListNode<Integer> curr=head;
        LinkedListNode<Integer> prev=head;

         while(curr!=null){
             if(curr.data==value){
                 prev.next=curr.next;
                 return true;
             }
             prev=curr;
             curr=curr.next;
         }

         return false;
    }
}
