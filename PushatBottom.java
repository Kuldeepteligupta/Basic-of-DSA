
import java.util.*;
public class PushatBottom {

    public static void pushatbtn(int data, Stack<Integer>  stack){
       if(stack.isEmpty()){
            stack.push(data);
            return ;
       }

          int top = stack.pop();
         pushatbtn(data, stack);
          stack.push(top);
    }
    public static void main(String[] args) {
           Stack st = new Stack<>();
           st.push(1);
           st.push(2);
           st.push(3);

            pushatbtn(4, st);
             while(!st.isEmpty()){
               System.out.println(st.peek());
               st.pop();
             }
    }
}
