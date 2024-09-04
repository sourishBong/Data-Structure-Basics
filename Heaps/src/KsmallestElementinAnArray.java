
import java.util.Arrays;
import java.util.PriorityQueue;

public class KsmallestElementinAnArray {

    public static void main(String[] args) {
        int arr[]={1,3,-2,4,7};
        int k=3;
        int result[]=findKSmallest(arr,k);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findKSmallest(int[] arr, int k) {

        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        int result[] = new int[k];
        int counter=0;
        for(int i=0;i<arr.length;i++){
            minHeap.add(arr[i]);
        }
        while(counter<k){
            result[counter]= minHeap.poll();
            counter++;
        }

        return result;
    }
}
