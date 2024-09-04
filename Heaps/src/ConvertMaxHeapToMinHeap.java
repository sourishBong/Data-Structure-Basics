import java.util.Arrays;

public class ConvertMaxHeapToMinHeap {

    public static int[] convertMax(int[] maxHeap) {

        int size=maxHeap.length;
        // Convert the max heap into a min heap using min_heapify starting from the last nonleaf node
        for (int i = size / 2; i >= 0; --i) {
            maxHeap = minHeapify(maxHeap, i, size);
        }
        return maxHeap;
    }

    private static int[] minHeapify(int[] maxHeap, int index, int size) {
        // Calculate the left and right child indices
        int left = index * 2 + 1;
        int right = (index * 2) + 2;
        int smallest = index;

        // Check if the left child is within the heap bounds and smaller than the current smallest
        if (left < size && maxHeap[smallest] > maxHeap[left]) {
            smallest = left;
        }

        // Check if the right child is within the heap bounds and smaller than the current smallest
        if(right<size && maxHeap[smallest]>maxHeap[right]){
            smallest=right;
        }

        // Swap the smallest element with the current index if needed, and recursively min heapify
        if(smallest!=index){
            int temp=maxHeap[smallest];
            maxHeap[smallest]=maxHeap[index];
            maxHeap[index]=temp;
            minHeapify(maxHeap,smallest,size);
        }

        return maxHeap;
    }

    public static void main(String[] args) {
        int maxHeap[]={9,4,7,1,-2,6,5};
        int result[]=convertMax(maxHeap);
        System.out.println(Arrays.toString(result));
    }
}
