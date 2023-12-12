  import java.util.Queue; 
 import java.util.LinkedList;
 public class Levelorder {


    static class Node{
        int data;
        Node left, right;
        public Node(int data){
           this.data = data ;
           this.left = null ;
           this.right = null ;
        }
       }
        static class BinaryTree{

      
       public static void Levelordertrav(Node root){
         if(root == null){
             return ;
         }
          Queue<Node> q = new LinkedList<>();
          q.add(root);
          q.add(null);

          while(!q.isEmpty()){
             Node currn = q.remove();
             if(currn == null){
                System.out.println();
                if(q.isEmpty()){
                break ;
             }  else{
                q.add(null);
             }
             }else{
                System.out.print(currn.data+" ");

                if(currn.left != null){
                    q.add(currn.left);

                }
                if(currn.right != null){

             
                    q.add(currn.right);
                }
             }
               
          }

       }

       public static  int  count(Node root){
         if(root == null){
            return 0;
         }

          int rh = count(root.left);
          int lh = count(root.right) ;
          return Math.max(rh, lh)+1;
       }

       public static int coutNode(Node root){
         if(root == null){
            return 0;
         }
         //   System.out.println(root.data+" ");

          int ln =coutNode(root.left);
          int rh = coutNode(root.right);
          return ln+rh+1;
       }

       public static int  sum(Node root ){
          if(root == null){
            return 0;
          }

           int ls = sum(root.left);
           int rs = sum(root.right);

           return ls+rs+root.data ;
       }

       public static int Height(Node root){
         if(root == null){
            return 0;
         }

          int lh = Height(root.left);
          int rh = Height(root.right);
          return lh+rh+1;
       }

       public static int daimeter(Node root){
         if(root == null){
             return 0;
         }
          int ld = daimeter(root.left);
          int rd = daimeter(root.right);
          int lh = Height(root.left);
          int rh = Height(root.right);
          int self = lh+rh+1;
          return Math.max( Math.max(rh, self), self);
       }

       
      } 


        static class info{
         int daim;
         int ht;
          info(int daim, int ht){
            this.daim = daim;
            this.ht = ht ;
          }
         }
          public static info diameter(Node root){
             if(root == null){
               return new info(0, 0);
             }

              info leftinfo =  diameter(root.left);
               info rightinfo = diameter(root.right);

                int  daimeter = Math.max(Math.max(leftinfo.daim, rightinfo.daim),leftinfo.ht+rightinfo.ht+1);
                int  Height = Math.max(leftinfo.ht, rightinfo.ht)+1;

              return new info(daimeter, Height);
          }

          public static boolean isidentical(Node root, Node subroot){
              if(root == null &&  subroot == null){
                 return true ;
              }
              else if(root == null || subroot == null){
                return false ;
              }
               
               if(!isidentical(root.left, subroot)){
                  return false ;
               }
               if(!isidentical(root.right, subroot)){
                  return false ;
               }
               return true ;
          }

         public static boolean subtree(Node root, Node subroot){

             if(root ==null){
                return false ;
             }
             
             if(root.data == subroot.data){
                if(isidentical(root, subroot)){
                  return true ;
                }
             }

             return  subtree(root.left, subroot) || subtree(root.right, subroot);

         }
 
     public static void main(String[] args) {
        Node nd = new Node(1);
        nd.left = new Node(2);
        nd.right = new Node(3);
        nd.left.left = new Node(4);
        nd.left.right = new Node(5);
        nd.right.right = new Node(6);
      //   BinaryTree bt = new BinaryTree();
      //   bt.Levelordertrav(nd);
      //   System.out.println("Height is");
      //   System.out.println(bt.count(nd));
      //   System.out.println("Node are");
      //   System.out.println(bt.coutNode(nd));
      //   System.out.println("the sum is");

      //   System.out.println(bt.sum(nd));

      //   System.out.println("Diameter");
      //   System.out.println(bt.daimeter(nd));
         //    Levelorder ll = new Levelorder();
         //   System.out.println(ll.diameter(nd).daim);

         Node subnd = new Node(2);
         subnd.left =  new Node(4);
         subnd.right = new Node(5);

         boolean ans = subtree(nd,subnd);
        System.out.println(ans);


     }
}
