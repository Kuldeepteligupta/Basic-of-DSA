
import java.lang.annotation.Retention;
import java.util.LinkedList;
import java.util.Queue;
public class IplementationofstackusingtwoQueue {


     static class Stackiml{
       static Queue<Integer> Q1 = new LinkedList<>();
       static Queue<Integer> Q2 = new LinkedList<>();

       public static boolean isEmpty(){
        return Q1.isEmpty();
       }

       public static void add(int data){
        while(!Q1.isEmpty()){
            Q2.add(Q1.remove());
        }
        Q1.add(data);

        while(!Q2.isEmpty()){
            Q1.add(Q2.remove());
            
        }
       }

       public static int peek(){
        if(Q1.isEmpty()){
            return -1;
        } 
         return Q1.get()
       }
     }
    public static void main(String[] args) {
        
    }
}
