public class MaximumSubArray {

    public static void main(String[] args) {
        int nums[]={-1,10,8};
        int ans=findMaxSumSubArray(nums);
        System.out.println(ans);
    }

    private static int findMaxSumSubArray(int[] nums) {

        int currMax=nums[0];
        int globalMax=nums[0];

        for(int i=1;i<nums.length;i++){
            if(currMax<0){
                currMax=nums[i];
            }else{
                currMax=currMax+nums[i];
            }
            globalMax=Math.max(globalMax,currMax);
        }
        return globalMax;
    }
}
