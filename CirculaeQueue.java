public class CirculaeQueue {


    static class Queue{
        static int arr[];
        static int size;
        static int front;
        static int rear ;
        Queue(int n){
            arr = new int[n];
            size = n ;
            rear =-1;
            front =-1;
        }

        public static boolean isEmpty(){
             return rear==-1 && front ==-1;
        }

        public static boolean isfull(){
            return (rear+1)%size == front ;
        }
        public static void add(int data){
           if(isfull()){
            System.out.println("full");
            return ;
           }
            if(front==-1){
                front = 0;
            }

            rear = (rear+1)%size ;
            arr[rear] = data ;
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("Empty w");
                return -1;
            }
          if(front == rear){
            front = rear = -1;
          }

            int res = arr[front];
            front = (front+1)%size ;
            return res;
            
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("idfdn");
                return -1;
            }
              return arr[front];
        }
    }
     public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.pop();
        }
     }
}
