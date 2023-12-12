import java.util.Stack;
public class Stackjvm {
    public static void main(String[] args) {
        Stack<Integer>  st = new Stack<>();
        st.push(10);
        st.push(40);
        st.pop();
        st.pop();
        st.push(10);
        st.push(50);
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }


    }
} 
