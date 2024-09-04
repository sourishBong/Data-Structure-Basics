import java.util.Stack;

public class ValidParanthesis {

    public static void main(String[] args) {
        String exp="{}[]()";
        boolean ans=isBalanced(exp);
        System.out.println(ans);
    }

    public static boolean isBalanced(String exp) { Stack<Character> stack=new Stack<>();

        for(int i=0;i<exp.length();i++){

            if(exp.charAt(i)=='[' || exp.charAt(i)=='{' || exp.charAt(i)=='('){
                stack.push(exp.charAt(i));
            }else if(exp.charAt(i)==']' || exp.charAt(i)=='}' || exp.charAt(i)==')'){
                if(stack.isEmpty())
                    return false;
                else{
                    char c=stack.pop();
                    if(c=='['){
                        if(!(exp.charAt(i) ==']'))
                            return false;
                    }else if(c=='{'){
                        if(!(exp.charAt(i) =='}'))
                            return false;
                    }else{
                        if(!(exp.charAt(i) ==')'))
                            return false;
                    }
                }
            }
        }
        if(!stack.isEmpty())
            return false;
        else
            return true;

    }
}
