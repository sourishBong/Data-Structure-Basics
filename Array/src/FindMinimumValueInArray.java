public class FindMinimumValueInArray {

    public static void main(String[] args) {

      //  int arr[]={1,2,-3,-1,-2};
        int arr[]={5,5,6,6,7};

        int min=findMinimum(arr);
        System.out.println(min);
    }

    private static int findMinimum(int[] arr) {

        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
