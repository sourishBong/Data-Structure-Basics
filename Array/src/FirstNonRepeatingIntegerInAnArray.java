import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingIntegerInAnArray {

    public static void main(String[] args) {

        int nums[]={5,5,6,6,7};
        int num=findFirstUniqueJava8(nums);
        System.out.println(num);
    }

    private static int findFirstUniqueJava8(int[] nums) {

        return Arrays.stream(nums)
                .mapToObj(s->s)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m->m.getValue()==1)
                .map(m->m.getKey())
                .findFirst()
                .get();

    }

    private static int findFirstUniqueMap(int[] nums) {

        Map<Integer,Integer> map=new TreeMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        int ans=map.entrySet().stream().filter(m->m.getValue()==1).map(m->m.getKey()).findFirst().get();
        return ans;
    }
}
