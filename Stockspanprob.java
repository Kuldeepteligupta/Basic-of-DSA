import java.util.*;
public class Stockspanprob{

        public static void spanstock(int stocks[], int span[]){
            Stack<Integer> st = new Stack<>();
            span[0] =1;
            st.push(0) ;
            for(int i=0; i<stocks.length; i++){
                int currPrice = stocks[i];
                while(!st.isEmpty() && currPrice > stocks[st.peek()]){
                  st.pop() ;
                }
                if(st.isEmpty()){
                    span[i] = i+1;
                }else{
                     int prevHigh = st.peek() ;
                     span[i] = i-prevHigh ;
                }
                st.push(i);
            }



        }
     public static void main(String[] args) {
        int stocks[] = {99,80,60,70,60,85,100};
        int span[] = new int[stocks.length];

         spanstock(stocks, span);
         for(int i=0; i<stocks.length; i++){
            System.out.println( "stock is"+ stocks[i] + " " + "span"+ " "+ span[i]);
         }
     }
}