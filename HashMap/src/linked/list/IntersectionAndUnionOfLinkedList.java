package linked.list;

import java.util.HashSet;
import java.util.Set;

public class IntersectionAndUnionOfLinkedList {

    private static LinkedListNode<Integer> insertNode(LinkedListNode<Integer> head, int x) {
        if(head==null){
            head=new LinkedListNode<>(x);
        }else{
            LinkedListNode<Integer> current=head;
            head=new LinkedListNode<>(x);
            head.next=current;

        }
        return head;
    }

    public static LinkedListNode < Integer > union(LinkedListNode < Integer > head1, LinkedListNode < Integer > head2) {
        Set<Integer> set=new HashSet<>();
        LinkedListNode < Integer > currentNode=head1;
        LinkedListNode<Integer> result = null;
        while(currentNode!=null){
            set.add(currentNode.data);
            currentNode=currentNode.next;
        }

        LinkedListNode < Integer > currentNode2=head2;

        while(currentNode2!=null){
            set.add(currentNode2.data);
            currentNode2=currentNode2.next;
            set.remove(currentNode2.data);
            }

        for(int x:set){
            result=insertNode(result,x);
        }


        return result;
    }

    public static LinkedListNode < Integer > intersection(LinkedListNode < Integer > head1, LinkedListNode < Integer > head2) {
        Set<Integer> set=new HashSet<>();
        LinkedListNode < Integer > currentNode=head1;
        LinkedListNode < Integer > check=null;
        LinkedListNode < Integer > result=check;
        while(currentNode!=null){
            set.add(currentNode.data);
            currentNode=currentNode.next;
        }

        LinkedListNode < Integer > currentNode2=head2;

        while(currentNode2!=null){
            if(set.contains(currentNode2.data)){
             result=insertNode(result,currentNode2.data);
            }
            currentNode2=currentNode2.next;
        }

        return result;
    }
}
