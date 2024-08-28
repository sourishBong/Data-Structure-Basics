import java.util.Arrays;

public class ProductofArrayExceptSelf {

    public static void main(String[] args) {

        int[] nums={2,4,0,6};
        //int[] nums={1,2,3,4};
        //int[] nums={15,0,0,0,0};
        int[] result=findProductBiDirectional(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] findProductBiDirectional(int[] nums) {
        int product[]=new int[nums.length];
        int left=1;
        int right=1;
        for(int i=0;i<nums.length;i++){
            product[i]=left;
            left=left*nums[i];
        }

        for(int i=nums.length-1;i>=0;i--){
            product[i]=product[i]*right;
            right=right*nums[i];
        }

        return product;
    }


    private static int[] findProduct(int[] nums) {
        int result[]=new int[nums.length];
        int index[]=new int[nums.length];
        int count=0;
        int product=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0) {
                product = product * nums[i];
            }else{
                count++;
                index[i]=1;
            }
        }
       // System.out.println(product);
       for(int i=0;i<nums.length;i++){
           if(count>0){
              if(index[i]==0){
                  result[i]=0;
              }else{
                  result[i]=product;
              }
           }else {
               result[i] = product / nums[i];
           }
       }
        return result;
    }


}
