public class LinkedList {

      static class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null ;
            }
        }
            // add elemtn at the first of the list
         void addfirst(int data){
            Node newNode = new Node(data);
          if(head == null){
            head = tail = newNode ;
            size++;
            return;
          }
            newNode.next = head ;
            head = newNode ;
            size++;
         }

         // add element at the end of the ll
         void addlast(int data){
          Node newNode = new Node(data);
           if(head == null){
            head = tail = newNode;
            size++;
            return ;
           }

            tail.next = newNode;
            tail = newNode ;
            size++;
        }
          void addmid(int data, int idx){
            Node newNode = new Node(data);
              if(head == null){
                addfirst(data);
                size++;
                return ;
            }
             Node temp = head ;
             int x =0;
             while(x <= idx-1){
                temp = temp.next ;
                x++;
            }
            newNode.next = temp.next ;
             temp.next = newNode;
             
             size++;
          }

          // print the linkedlist
          void print(){
            if(head == null){
                System.out.println("empty linkedlist");
                return ;
            }
            Node temp = head ;
            while(temp != null){
                System.out.print(temp.data+" =>");
                temp = temp.next;
            }
            System.out.println();
          }
          // print the size of the ll
          void printsize(){
            System.out.println(size);
          }

   // remove first
        int removefirst(){
            if(head == null){
                return -1;
            }
            if(head == tail){
                head = null;
                tail = null ;
                size--;
              return  head.data;
            }
            int val = head.data;
            head = head.next ;
            size -- ;
            return val;
        }

        // remove last
        int removelast(){
            if(head == null){
                return -1;
            }
             if(head == tail){
                 head = null;
                 tail = null;
                   size--;
                 return  head.data;
               
                
             }
            int val = tail.data;
            int x = 0;
            Node temp = head;
          while(x<size-2){
              temp = temp.next;
              x++;
          }
          temp.next = null ;
          tail = temp ;
          size--;
         return val ;
     }

       int  iterativesearch(int key){
         if (head == null){
            System.out.println("empty ll");
            return -1;
        }
            Node temp = head;
            int x =0;
            while(temp != null){
                if(temp.data == key){
                    return x ;
                }
                temp= temp.next ;
                x++;

            }
            return -1;
      }
       int helper(Node head, int key){
      if(head == null){
        return -1;

      }
         if(head.data == key){
            return 0;
         }
             int idx = helper(head.next, key);
              if(idx == -1){
                return -1;
              }
              return   idx + 1;
       }

      int recursivesearch(int key){
               return helper(head,key);
      }
       void reversell(){
      if(head == null){
        System.out.println("empty ll");
        return ;
      } 
         Node curr = head ;
         Node prev = null;
         Node next;
          while(curr != null ){
             next = curr.next ;
              curr.next = prev ;
              prev = curr ;
              curr = next;

          }head = prev;
         
       }
        int removenthnode(){
         int sz = 0;
         Node temp = head ;
         while(temp != null){
          temp = temp.next;
          sz++;
         }
          return  sz ;
       }
       void  removenodefromlast(int n){
          
           int size =  removenthnode();
           int x = 0;
           Node prev = head ;
           while(x<size-n){
            prev = prev.next;
            x++;
           }

             prev.next = prev.next.next;
       }

       // for palandrome
       Node findmid(Node head){
          Node slow = head;
          Node fast = head ;
           Node temp = head;
         while(fast != null && fast.next != null){
          slow = slow.next;
          fast = fast.next.next;
         }
               return slow ;
          }
    /**
     * @return
     */
    Boolean findpalandrome(){

      if(head == null){
         return true;
      } if(head.next == null){
        return true ;
      }

          Node midNode = findmid(head);
           Node curr = midNode ;
           Node prev = null;
           Node next;

           while(curr != null){
            next = curr.next ;
            curr.next = prev;
            prev = curr;
            curr =next ;
           }

           Node right = prev;
           Node left = head ;
         while(right != null ){
          if(right.data != left.data){
              return false;
          }
            right = right.next ;
            left = left.next ;
         }
         return true ;
   }
       
   boolean detectcycle(){

     if(head == null && head.next == null){
      return false ;
     }
       Node slow = head;
       Node fast = head ;

       while(fast != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
              return true ;
            }
       }
       return false ;
   }
         
    void breakcycle(){
      Node slow = head;
      Node fast = head ;
      while(fast != null && fast.next != null){
        slow = slow.next ;
        fast=fast.next.next ;
         if(fast == slow){
          slow = head ;
          break ;
         }
      }

       Node prev = null ;
       while(fast !=slow){
        slow = slow.next;
        prev = fast;
        fast = fast.next ;
        //  idx++ ;
       }
       prev.next = null ;

    }
         public static int size = 0;
         public static Node head;
         public  static Node tail ;
    public static void main(String[] args) {
      
   LinkedList ll = new LinkedList();
  //  ll.addfirst(1);
  //  ll.addlast(2);
  //  ll.addfirst(1);
  //  ll.addfirst(2);
  //   ll.addmid(1,2);
    head = new Node(10);
    head.next = new Node(20);
    head.next.next = new Node(20);
    head.next.next.next = new Node(50);
    head.next.next.next.next = head.next.next;
    // ll.print();
     System.out.println(ll.detectcycle());
    ll.breakcycle();
   ll.print();
//    ll.printsize();
//    ll.removefirst();
//    ll.removelast();
//    ll.print();
//   ll.printsize();
//   System.out.println(ll.iterativesearch(10)+" index");
//   System.out.println(ll.recursivesearch(10));
  // ll.reversell();
  // // ll.print();
  // ll.removenodefromlast(3);
  // ll.print();
    // System.out.println( ll.findpalandrome());


    System.out.println(ll.detectcycle());
    }
  }