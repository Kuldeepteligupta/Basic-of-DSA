public class Binary {



    static class Node{
        int data;
        Node left, right;
         Node(int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;
         }

         public static int Height(Node root){
             if(root == null){
                return  0;
             }
             int lh = Height(root.left);
             int rh = Height(root.right);

             return Math.max(lh, rh)+1;
         }
         public static int count(Node root){
            if(root == null){
                return 0;
            }

             int lc = count(root.left);
             int rc = count(root.right);
             return lc+rc+1;
         }

         public static int sum(Node root){
            if(root == null){
                return 0;
            }
             int leftsum = sum(root.left);
             int rightsum = sum(root.right) ;
            
             return leftsum+rightsum+root.data ;
         }

         public static int daimeter(Node root){
            if(root == null){
                return 0;
            }

             int ld = daimeter(root.left);
             int rd = daimeter(root.right);
             int lh = Height(root.left);
             int rh = Height(root.right);
             int selfd = lh+rh+1;
             return Math.max(Math.max(ld, rd), selfd);
            
         }
    }
     public static void main(String[] args) {
         Node nd = new Node(1);
          nd.left = new Node(2);
          nd.left.left = new Node(4);
          nd.left.right = new Node(5);
          nd.right = new Node(3);
          nd.right.right = new Node(6);
        //   nd.right.right.right = new Node(20);

        //   System.out.println(nd.Height(nd));
        //   System.out.println(nd.count(nd));
        //   System.out.println(nd.sum(nd));
          System.out.println(nd.daimeter(nd));
     }
}
