
import java.util.Stack;
public class Validparenthisis {


       public static boolean isvalid(String str){
           Stack<Character> st = new Stack<>();

           for(int i=0; i<str.length(); i++){
             char ch = str.charAt(i);
             if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
             }else{
                 if(st.isEmpty()){
                    return false;
                 }
                 if((st.peek() == '(' && ch == ')') 
                 || (st.peek() == '{' && ch == '}')
                 || (st.peek() =='[' && ch == ']')){
                    st.pop();
                 }else{
                    return false ;
                 }
             }
           }
            if(st.isEmpty()){
            return true ;
           }
           return false;
           
   }


     public static void main(String[] args) {
         String str = "(({{[]}}}))";

          boolean result = isvalid(str);
          System.out.println(result);
     }
}
