public class NewBST{

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data ;
        }
    }
        public static Node insert(Node root, int value){
             if(root == null){
                root = new Node(value);
                return root ;
             }
             if(root.data <value){
                root.right = insert(root.right, value);
             }else{
                root.left = insert(root.left, value);
             }
             return root ;
             
        }
        public static void inorder(Node root){
             if(root == null){
                return ;
             }
             inorder(root.left);
             System.out.println(root.data+" ");
             inorder(root.right);
        }
      public static boolean search(Node root, int key){
        if(root == null){
            return false ;
        }
          if(root.data == key){
            return true;
          }
        if(root.data <key){
            return search(root.right, key);

        } 
        if(root.data > key)
            return search(root.left, key);
        
         return false ;

      }
     public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root  = null ;
        // NewBST tree = new NewBST();
        for(int i=0; i<values.length; i++){
             root =insert(root,values[i]);   
        }
        inorder(root);

         boolean res =search(root, 5);
         System.out.println(res); 
     }
}