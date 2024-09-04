import java.util.*;

public class FindPairs {

    public static void main(String[] args) {
        int nums[]={3,4,7,1,12,9};
        int ans[][]=findPairs(nums);
        System.out.println(Arrays.deepToString(ans));
    }

    public static int[][] findPairs(int[] nums) {
        Map<Integer, List<Integer>> map=new HashMap<>();
        int result[][]=new int[2][2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++) {
                int sum = nums[i] + nums[j];

                if (map.containsKey(sum)) {
                    result[0][0] = map.get(sum).get(0);
                    result[0][1] = map.get(sum).get(1);
                    result[1][0] = nums[i];
                    result[1][1] = nums[j];
                    return result;
                } else {
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    map.put(sum,list);
                }
            }
        }
        

        return null;
    }
}
