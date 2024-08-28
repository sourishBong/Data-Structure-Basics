import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTwoNumsAddUpToK {

    public static void main(String[] args) {

        int arr[]={1,10,8,4,9};
        int n=17;

        int result[]=findSumTwoPointer(arr,n);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findSum(int[] arr, int n) {

        Map<Integer,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        for(int k=0;k<arr.length;k++){
            int diff=n-arr[k];
            if(map.containsKey(diff)){
                i=arr[k];
                j=diff;
            }else{
                map.put(arr[k],1);
            }
        }
       return new int[]{i,j};
    }

    private static int[] findSumTwoPointer(int[] arr, int n) {
        int i=0;
        int j=arr.length-1;

        //sort the array
        Arrays.sort(arr);
        int first=0;
        int second=0;
        while(i<j){
            if(arr[i]+arr[j]==n) {
            first=arr[i];
            second=arr[j];
            break;
            }else if(arr[i]+arr[j]<n)
                i++;
            else
                j--;
        }

        return new int[]{first,second};
    }

}
