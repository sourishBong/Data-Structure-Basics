import java.util.*;

public class FindSymmetry {

    public static void main(String[] args) {
       // int nums[][]={{1,2},{3,4},{5,9},{4,3},{9,5}};
        int nums[][]={{1,2},{4,6},{4,3},{6,4},{5,9},{3,4},{9,5}};
        List<List<Integer>> list=findSymmetric(nums);
        System.out.println(list);
    }

    public static List<List<Integer>> findSymmetric(int[][] arr) {
        List<List<Integer>> result=new ArrayList<>();
        Set<List<Integer>> lookup=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            List<Integer> pair = Arrays.asList(arr[i][0], arr[i][1]);
            List<Integer> reversePair = Arrays.asList(arr[i][1], arr[i][0]);
                if(lookup.contains(reversePair)){
                    result.add(pair);
                    result.add(reversePair);
                }else{
                    lookup.add(pair);
                }
        }

        return result;
    }
}
