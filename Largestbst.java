public class Largestbst {


     static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data ;
            this.left = null ;
            this.right = null ;

        }
     }


    static class info{
         boolean isBst;
         int size;
         int max;
         int min;
      public  info(boolean isBst, int size, int max, int min){
             this.isBst = isBst;
             this.size =size ;
             this.max = max ;
             this.min = min ;
         }
    }
     static int sizebst = 0;
    public static int Largestbstsize(Node root){

        info  leftinfo = Largestbstsize(root.left);
        info  rightinfo = Largestbstsize(root.right);

        int size = leftinfo.size+ rightinfo.size+1;
        int min = Math.min(root.data, Math.min(leftinfo.min, leftinfo.max));
        int max = Math.max(root.data, Math.min(rightinfo.min, leftinfo.min));

        i


    }
    public static void main(String[] args) {
        
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
    

    }
}
