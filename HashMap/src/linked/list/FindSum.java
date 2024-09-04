package linked.list;

import java.util.HashMap;
import java.util.Map;

public class FindSum {

    public static int[] findSum(int[] arr, int n) {

        Map<Integer,Integer> map=new HashMap<>();
        int[] result=new int[2];

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(n-arr[i])){
                result[0]=n-arr[i];
                result[1]=arr[i];
            }else{
                map.put(arr[i],1);
            }
    }
        return result;
}
}
