import java.util.ArrayList;

class ll{
    public static class Stack{
     static ArrayList<Integer> list = new ArrayList<>();
      public static boolean isEmpty(){
        return list.size() == 0;
      }
     // push the element 
     public static void push(int data){
        list.add(data);
     }
     public static int pop(){
        int val = list.get(list.size()-1);
        list.remove(list.size()-1);
        return val ;
     }
     public static int peek(){
        return list.get(list.size()-1);
     }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
         st.push(1);
          st.push(1);

          while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
          }
    }
}