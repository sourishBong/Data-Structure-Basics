import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        //int nums[]={10,20,30,40,50};
        int nums[]={1,2,3,4,5,6,7};
        int k=3;

        int result[]=rightRotate(nums,k);
        System.out.println(Arrays.toString(result));
    }

    private static int[] rightRotate(int[] nums, int k) {
        if (nums.length == 0) {
            k = 0;
        } else {
            k = k % nums.length;
        }

        int result[]=new int[nums.length];

        //arraycopy(Object src,  int  srcPos,Object dest, int destPos,int length);
        System.arraycopy(nums,nums.length-k,result,0,k);
        System.arraycopy(nums,0,result,k,nums.length-k);
        return result;
    }

    private static int[] rightRotateNaive(int[] nums, int k) {
        if (nums.length == 0) {
            k = 0;
        } else {
            k = k % nums.length;
        }

        int result[]=new int[nums.length];

        // Copy elements from the end
        for (int i = 0; i < k; i++) {
            int j=nums.length-k+i;
            result[i]=nums[j];

        }

        // Copy remaining elements
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[i - k];
        }

        return result;
    }
}
