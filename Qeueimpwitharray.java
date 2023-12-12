public class Qeueimpwitharray {


     static class Queue{
        static int arr[];
        static  int size;
        static int rear ;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;

        }
            public static boolean isEmpty(){
                return rear ==-1;
            }
           public static void add(int data){
               if(rear == size-1){
                System.out.println("Full Queue");
                return ;
               }

                rear = rear+1;
                arr[rear] = data;
           }

           public static int  remove(){
            if(isEmpty()){
                return -1;
            }
             int front = arr[0];
             for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];

             }
              rear = rear -1;
             return front;
           }

           public static int peek(){
              if(isEmpty()){
                return -1;
              }
              return arr[0];
           }
     }
    public static void main(String[] args) {
        Queue Q = new Queue(5);

       Q.add(10);
       Q.add(20);
       Q.add(30);

       while(!Q.isEmpty()){
        System.out.println(Q.peek());
        Q.remove();
       }
    }
}
