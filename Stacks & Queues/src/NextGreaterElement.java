import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

    public static void main(String[] args) {
        //int[] arr={10,5,2,13,15,9,2,16};
        int[] arr={2,6,6,19,11,2,1,12,15};
        int ans[]=nextGreaterElement(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        Arrays.fill(result,-1);
        Stack<Integer> stack=new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            if(!stack.isEmpty()) {
                while (!stack.isEmpty() && arr[i] >= stack.peek()) {
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                result[i]= -1;
            }
            else{
                result[i] = stack.peek();
            }
           stack.push(arr[i]);
        }
        return result;
    }
}
