import java.util.*;
public class Reverseofstack {

       public static void pushatbottom(Stack<Integer> st, int data){
         if(st.isEmpty()){
            st.push(data);
            return ;
         }

               int top = st.pop();
                pushatbottom(st,data);
                 st.push(top);
       }
      public static void reverse(Stack<Integer> st){

          if(st.isEmpty()){
            return ;
          }
               int top = st.pop() ;
               reverse(st);
               pushatbottom(st, top);

      }

      public static void print(Stack<Integer> st){
           while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
           }
      }
      public static void main(String[] args) {
           Stack<Integer> st = new Stack<>();
           st.push(10);
           st.push(20);
           st.push(30);
           System.out.println("The real stack is");
        //    print(st);
           System.out.println("The reverse stakcis");
           reverse(st);
           print(st);
          
      }
}
