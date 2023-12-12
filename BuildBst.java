public class BuildBst{


    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null ;
            this.right = null ;
        }
    }

    public static Node Bst(Node root, int value){
        if(root == null){
            root = new Node(value);
            return root ;
        }
         
         if(root.data > value){
            root.left = Bst(root.left, value);
         }else{
            root.right = Bst(root.right, value);
         }

         return root ;
    }

    public static void inorder(Node root){
       if(root == null){
        return ;
       }

         inorder(root.left);
         System.out.print(root.data+" ");
         inorder(root.right);
    }

    public static boolean search(Node root, int key){
           if(root == null){
             return false ;
           }
         if(root.data == key){
            return true ;
         }

         if(key > root.data){
           return  search(root.right, key);
         }else{
            return search(root.left, key);
         }

        //    return false ;
    }

     public static Node delete(Node root, int value){
        if(root.data < value){
            root.right = delete(root.right, value);
        }

         else if(root.data > value){
          root.left = delete(root.left, value);
        }
         else{
           if(root.left == null && root.right == null){
            return null ;
           }
           if(root.left == null){
            return root.right ;
           }else if(root.right== null){
            return root.left ;
           }
             Node fs = findsucc(root.right);
                  root.data = fs.data ;
                  root.right = delete(root.right, fs.data);
                
            }   
              return root ;
                         
          }                 

         
         public static Node findsucc(Node root){
           while(root.left != null){
             root= root.left ;
           }
           return root ;
         }
    
      // public static Node finsuccessor(Node root){
      //      if(root.left != null){
      //        root = root.left ;
             
      //      }
      //      return root ;
      //    }

      public static void printinrange(Node root, int k1, int k2){

         if(root== null){
          return ;
         }
         if(root.data >= k1 && root.data <=k2){
                  printinrange(root.left, k1, k2);
                  System.out.print(root.data+" ");
                  printinrange(root.right, k1, k2);
         }else if
           (root.data > k1 && root.data > k2){
          printinrange(root.left, k1, k2);
         }else{
          printinrange(root.right, k1, k2);
         }
         
      }
     public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null ;

         for(int i =0;i<values.length; i++){
             root = Bst(root, values[i]);
         }
        //  System.out.println(root.data);
          //  inorder(root);
        // System.out.println(search(root, 5));

          // Node res = delete(root, 3);
          // System.out.println();
          // inorder(res);

          
         printinrange(root, 2, 4);
          

     }

}