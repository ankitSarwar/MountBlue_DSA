package mountBlue;

import java.util.Stack;

public class ValidParanthisis {
    public static void main(String[] args) {
        String s= "()[]{}";
        int n=s.length();

        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(')');
            }else if(c=='['){
                st.push(']');
            }else if(c=='{'){
                st.push('}');
            }else if( st.isEmpty() || st.pop()!=c){

                System.out.println(false);
                return;
            }
        }
        System.out.println(st.isEmpty());
    }
}
