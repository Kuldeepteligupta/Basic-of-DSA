import java.util.Stack;

public class Stacjreverse {

    public static void pushatbottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushatbottom(s, data);

        s.push(top);
    }

    public static void rev(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        rev(s);
        pushatbottom(s, top);
    }

    public static void print(Stack<Integer> st) {
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        // print(st);
        rev(st);
        print(st);
    }
}
