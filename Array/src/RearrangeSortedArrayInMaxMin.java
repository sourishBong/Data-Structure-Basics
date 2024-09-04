import java.util.Arrays;

public class RearrangeSortedArrayInMaxMin {

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,8};
        int result[]=rearrangeArray(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] rearrangeArray(int[] nums) {

        int low=0;
        int high=nums.length-1;
        int maxElement=nums[high]+1;

        //encoding phase
        for(int i=0;i<nums.length;i++){
            if(i%2==0)//encoding at even index
            {   int highVal=nums[high]%maxElement;
                nums[i]=nums[i]+(highVal)*maxElement;
                high--;
            }else{
                int lowVal=nums[low]%maxElement;
                nums[i]=nums[i]+(lowVal)*maxElement;
                low++;
            }
        }

        //decoding phase
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]/maxElement;
        }

        return nums;
    }
}
