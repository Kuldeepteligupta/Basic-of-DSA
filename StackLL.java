

public class StackLL{

       static class stackB{

      
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null ;
        }
    }

    public static boolean isEmpty(){
          return head == null ;
    }
      public static void push(int data){
        Node newNode = new Node(data);
         if(isEmpty()){
            head = newNode;
            return ;
         }
         newNode.next = head;
          head = newNode ;

      }

      public static int pop(){
        if(isEmpty()){
            return -1;
        }
          int top = head.data;
          head = head.next ;
          return top ;
      }

      public static int peek(){
         if(isEmpty()){
            return -1;
         }
         return head .data;
      }
      static Node head;
      }
    public static void main(String[] args) {
           stackB st = new stackB();
           st.push(10);
           st.push(5);
           st.push(10);

           while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
           }

    }
}