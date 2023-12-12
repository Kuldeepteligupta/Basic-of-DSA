
import java.util.Stack;
public class StackEX{
 // reverse of the string using stack


  public static String str(String str){
        Stack<Character> st = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            st.push(str.charAt(idx));
            idx++;
        }
        StringBuilder stb = new StringBuilder("");
             while(!st.isEmpty()){

          
             char ch =  st.pop();
             stb.append(ch);
             }
             return stb.toString();
         }
         
    
    public static void main(String[] args) {
          String str = "hello";
          String res = str(str);
          System.out.println(res);
    }
}