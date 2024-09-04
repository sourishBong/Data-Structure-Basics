package linked.list;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesfromLinkedList {

    public static LinkedListNode < Integer > removeDuplicates(LinkedListNode < Integer > head) {

        LinkedListNode<Integer> currentNode=head;
        LinkedListNode<Integer> prev=head;
        Map<Integer,Integer> map=new HashMap<>();

        while(currentNode!=null){

            if(map.containsKey(currentNode.data)){
              prev.next=currentNode.next;
              currentNode=prev;
            }else{
                map.put(currentNode.data,1);
            }
            prev=currentNode;
            currentNode=currentNode.next;
        }

        return head;
    }
}
