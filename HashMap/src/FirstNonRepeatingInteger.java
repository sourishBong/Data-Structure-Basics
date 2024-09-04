import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingInteger {

    public static void main(String[] args) {
        int nums[]={4,5,5,6,6,7,4};
        int ans=findFirstUnique(nums);
        System.out.println(ans);
    }

    public static int findFirstUnique(int[] nums) {

      int a=Arrays.stream(nums)
                .mapToObj(num->num)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m->m.getValue()==1)
                .map(m->m.getKey())
                .findFirst()
                .get();
        return a;
    }
}
