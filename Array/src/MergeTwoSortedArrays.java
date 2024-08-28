import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {

        int nums1[]={1,3,4,5};
        int nums2[]={2,6,7,8};

        List<Integer> num1= Arrays.asList(1,3,4,5);
        List<Integer> num2= Arrays.asList(2,6,7,8);

        ArrayList result2=mergeArrays(num1,num2);
        System.out.println(result2);

        int result[]=mergeSortedArray(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }

    private static int[] mergeSortedArray(int[] nums1, int[] nums2) {

        int result[]=new int[nums1.length+nums2.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                result[k]=nums1[i];
                i++;
            }else{
                result[k]=nums2[j];
                j++;
            }
            k++;
        }

        while(i<nums1.length){
            result[k]=nums1[i];
            i++;
            k++;
        }

        while(j<nums2.length){
            result[k]=nums2[j];
            j++;
            k++;
        }

        return result;
    }

    public static ArrayList<Integer> mergeArrays(List<Integer> nums1, List<Integer> nums2) {
        ArrayList<Integer> result=new ArrayList<>();

        int i=0;
        int j=0;


        while(i<nums1.size() && j<nums2.size()){
            if(nums1.get(i)<nums2.get(j)){
                result.add(nums1.get(i));
                i++;
            }else{
                result.add(nums2.get(j));
                j++;
            }
        }

        while(i<nums1.size()){
            result.add(nums1.get(i));
            i++;
        }

        while(j<nums2.size()){
            result.add(nums2.get(j));
            j++;
        }

        return result;
    }
}
