import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrnagePositiveNegativeValues {

    public static void main(String[] args) {
        int arr[]={5,-2,7,3,0,8,0,-6};
        rearrange(arr);
    }

    private static void rearrange(int[] arr) {
        int leftMostElement=0;

        for(int curr=0;curr<arr.length;curr++){
            if(arr[curr]<0){
                if(curr!=leftMostElement){
                    int temp=arr[curr];
                    arr[curr]=arr[leftMostElement];
                    arr[leftMostElement]=temp;
                }
                leftMostElement++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    private static void rearrangeNotInPlace(int[] arr) {
        List<Integer> positive=new ArrayList<>();
        List<Integer> negative=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                negative.add(arr[i]);
            }else{
                positive.add(arr[i]);
            }
        }
        int j=0,k=0,l=0;
        while(j<negative.size()){
            arr[l]=negative.get(j);
            j++;
            l++;
        }

        while(k<positive.size()){
            arr[l]=positive.get(k);
            k++;
            l++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
