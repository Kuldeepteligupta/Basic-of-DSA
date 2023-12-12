
import java.util.*;
public class ImplementationofQueueusingtwostacks {

      static class Queue{
      static Stack<Integer> st1 = new Stack<>();
       static Stack<Integer> st2 = new Stack<>();

        public static boolean isEmpty(){
            return st1.isEmpty();
         }

         public static void add(int data){
            while(!st1.isEmpty()){
                   st2.push(st1.pop());
            }
            st1.push(data);

            while(!st2.isEmpty()){
                st1.push(st2.pop());
            }
         }
         public static int pop(){
            if(st1.isEmpty()){
                System.out.println("Empty stac");
                return -1;
            }

             return st1.pop();
         }

         public static int peek(){
            return st1.peek();
         }
        
      }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.pop();
        }
    }
}
