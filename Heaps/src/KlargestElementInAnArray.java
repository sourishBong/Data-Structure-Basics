import java.util.Comparator;
import java.util.PriorityQueue;

public class KlargestElementInAnArray {

    public static int[] findKLargest(int[] nums, int k) {

        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Comparator.reverseOrder());
        int result[]=new int[k];
        int counter=0;
        for(int i=0;i<nums.length;i++){
            maxHeap.add(nums[i]);
        }

        while(counter<k){
            result[counter]=maxHeap.poll();
            counter++;
        }
        return result;
    }
}
