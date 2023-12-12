import java.util.PriorityQueue;
public class PrioretyQueue{
      static class student implements Comparable<student>{
         int rank;
         String name;
         public student(String name, int rank){
            this.name = name ;
            this.rank = rank ;
         }
         @Override
         public int compareTo(student s2){
             return  this.rank - s2.rank ;
         }
      }
     public static void main(String[] args) {
        PriorityQueue<student> pq = new PriorityQueue<>();
        pq.add(new student("A", 010));
        pq.add(new student("b", 020));

        

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + "-> "+ pq.peek().rank);
            pq.remove();
        }
     }
}