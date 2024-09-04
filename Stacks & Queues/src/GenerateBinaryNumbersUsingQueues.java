import java.util.Arrays;
import java.util.LinkedList;

public class GenerateBinaryNumbersUsingQueues {

    public static void main(String[] args) {
            int n=3;
            String[] result=findBin(n);
        System.out.println(Arrays.toString(result));
    }

    public static String[] findBin(int n) {
        String[] result = new String[n];
        Queue<String> queue=new Queue<>(n+1);
        queue.enqueue("1");

        for(int i=0;i<n;i++){
            result[i]= queue.dequeue();
            String s1=result[i]+"0";
            String s2=result[i]+"1";
            queue.enqueue(s1);
            queue.enqueue(s2);
        }

        return result;
    }
}
