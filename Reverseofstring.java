import java.util.Stack;

public class Reverseofstring{


      public static String rev(String str){
           Stack<Character> st = new Stack<>();
           int idx = 0;
            while(idx<str.length()){
                  st.push(str.charAt(idx));
                  idx++;
            }
           StringBuilder sb = new StringBuilder("");
             while(!st.isEmpty()){
                   char curr = st.pop();
                   sb.append(curr);

             }

             return sb.toString();

      }
      public static void main(String[] args) {
            String result = rev("abc");
            System.out.println(result);
      }

}