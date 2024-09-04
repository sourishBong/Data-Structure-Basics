package practise.linkedlist;

import practise.LinkedListNode;

public class RemoveDuplicatesFromList {

    public static void main(String[] args) {

    }

    public static LinkedListNode< Integer > removeDuplicates(LinkedListNode < Integer > head) {

        if(head==null)
            return null;

        if(head.next==null)
            return head;

        LinkedListNode <Integer> outer=head;


        while(outer!=null){
            LinkedListNode <Integer> inner=outer;
            while(inner!=null  && inner.next != null){
                if(outer.data==inner.next.data){
                    inner.next=inner.next.next;
                }else{
                    inner=inner.next;
                }
            }
            outer=outer.next;
        }

        return head;
    }
}
