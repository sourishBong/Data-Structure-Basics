import java.util.*;
class CheckSubZero {
    public static void main(String[] args) {
        int arr[]={2,-3,-2,4,-3,1,6,-6,7,8};
        boolean ans=findSubZero(arr);
        System.out.println(ans);
    }

    public static boolean findSubZero(int[] arr) {

        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];

            if(sum==0 || arr[i]==0 || map.containsKey(sum)){
                return true;
            }else{
                map.put(sum,i);
            }
        }

        return false;
    }
}