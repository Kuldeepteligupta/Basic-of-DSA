
import java.util.Stack;
public class Queueusingtwostacks{


    static class Stackimp{
          static Stack<Integer> s1 = new Stack<>();
          static Stack<Integer> s2 = new Stack<>();
         
          public static boolean isEmpty(){
            return isEmpty() ;
          }

          public static int  add(int data){
              return   data ;
          }

          public static int pop(){
            if(s1.isEmpty()){
                return -1;
            }
             while(s1.isEmpty()){
                s2.push(s1.pop());
             }
               
          }

          public static int peek(){
            if(s1.isEmpty()){
           return -1;
            }

            return s1.get(s1.size()-1);
          }
    }
    public static void main(String[] args) {
        Stackimp st = new Stackimp();
        st.add(10);
        st.add(20);
        st.add(30);

        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop() ;
        }
    }
}