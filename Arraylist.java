

public class Arraylist{
   int n =5 ;
    int arr[] = new int[n];
    int top = -1;
   public void push(int data){
          if(top >= n-1){
            System.out.println("Stack is full");
            return ;
          }else{
            top++;
            arr[top] = data ;
          }
    }

   public  void pop(){
        if(top ==-1){
            System.out.println("The stack is empty");
            return  ;
        }else{
            
          System.out.println("pooped"+arr[top]);
        }
       
    }
     int    peek(){
        if(top <= -1){
           System.out.println("stack is empty");
           return -1;
        }else{
            return arr[top];
        }
     }
          
      public  void print(){
         while(top != -1){
            System.out.println(st.peek());
            top--;
         }
       }



    public static void main(String[] args) {
       Arraylist st = new Arraylist();
       st.push(10);
       st.push(12);
       
       st.print();

      
    //    System.out.println("the peek el"+st.peek());
    //    st.print();
       





    }
}