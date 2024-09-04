import java.util.*;

class CheckSubset {
    public static void main(String[] args) {

        int array1[]={12,9,-3,16,55,3,18,23,65,1};
        int array2[]={1,3,10,-3};

        boolean ans=IsSubset(array1,array2);
        System.out.println(ans);

    }

    public static boolean IsSubset(int[] array1, int[] array2) {

        Set<Integer> set=new HashSet<>();

        for(int i:array1){
            set.add(i);
        }

        for(int i:array2){
            if(set.contains(i)){
                return false;
            }
        }
        return true;
    }
}