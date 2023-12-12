import java.util.ArrayList;
public class Stackbasic{


     static class stackB{
        static ArrayList<Integer> list = new ArrayList<>();


       public static boolean isEmpty(){
          return list.size() == 0;
       }
      public static void add(int data){
          list.add(data);
      }
      public static int pop(){
           if(list.isEmpty()){
            return -1;
           }
          int top = list.get(list.size()-1);
               list.remove(list.size()-1);
               return top;
      }
   public static int peek(){
     if(list.isEmpty()){
        return -1;
     }
    return list.get(list.size()-1);
    
   }


     }
    public static void main(String[] args) {
         stackB st = new stackB();
          st.add(10);
          st.add(20);
          st.add(30);
         
           while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
           }
           

    }
}