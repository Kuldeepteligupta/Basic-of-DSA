import java.util.ArrayList;

public class Heap {

      static class heap{
            ArrayList<Integer> arr = new ArrayList<>();

            public void insert(int data){
                  arr.add(data);

                  int childidx = arr.size()-1;
                  int paridx = childidx-1/2;
                   while(arr.get(paridx)> arr.get(childidx)){
                        int temp = arr.get(paridx);
                        arr.set(paridx,arr.get(childidx));
                        arr.set(paridx, temp);

                        childidx = paridx ;
                        paridx = childidx-1/2;
                   }
            }

            public int peek(){
                  return arr.get(0);
            }

            public void remove(){
                  int val = arr.get(0);

                  int temp = arr.get(0);
                  arr.set(0, arr.get(arr.size()-1));
                  arr.set(arr.size()-1, temp);

                  heapify(0);
                   
            }
            private void heapify(int i){
              int leftidx= 2*i+1;
              int rightidx = 2*i+2;
              int minidx = i;

              if(minidx < leftidx && arr.get(leftidx) < arr.get(minidx) ){
                  minidx = leftidx;
              }
              if(minidx < rightidx && arr.get(minidx)> arr.get(rightidx)){
                  minidx = rightidx ;
              }

              if(minidx !=i){
                  int temp = arr.get(minidx);
                  arr.set(minidx, arr.get(i));
                  arr.set(i, temp);
              }
              heapify(minidx);

            }
            public boolean isEmpty(){
                  return arr.size() == 0;
            }
      }

      public static void main(String[] args) {
         heap hp = new heap();
         hp.insert(10);
         hp.insert(20);
         hp.insert(30);
         hp.insert(40);
         hp.insert(50);

         while(!hp.isEmpty()){
            System.out.println(hp.peek());
             hp.remove();
         }
      }
}
