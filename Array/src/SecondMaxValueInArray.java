public class SecondMaxValueInArray {

    public static void main(String[] args) {

      //  int nums[]={4,2,1,5,0};
        int nums[]={-2,9};
        int ans=findSecondMaximum(nums);
        System.out.println(ans);
    }

    private static int findSecondMaximum(int[] arr) {
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;

        // Keep track of Maximum value, whenever the value at an array index is greater
        // than current Maximum value then make that max value 2nd max value and
        // make that index value maximum value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondmax = max;
                max = arr[i];
            }
            else if (arr[i] > secondmax && arr[i] != max) {
                secondmax = arr[i];
            }
        }//end of for-loop

        return secondmax;
    }
}
