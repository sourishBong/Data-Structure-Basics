import java.util.Arrays;

public class RemoveAllEvenIntegersFromArray {

    public static void main(String[] args) {

        int arr[]={1,3,-2,4,7};
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0) {
                arr[k] = arr[i];
                k++;
            }
        }
        int result[]=new int[k];
        for(int i=0;i<k;i++){
            result[i]=arr[i];
        }
        System.out.println(Arrays.toString(result));
    }
}
