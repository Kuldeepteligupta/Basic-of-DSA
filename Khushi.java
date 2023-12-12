import java.util.ArrayList;

import java.util.Queue;
import java.util.LinkedList;

public class Khushi{

   static class Edge{
     int sr;
     int desti;
     int wt;
      Edge(int s, int d, int w){
         this.sr = s;
         this.desti = d;
         this.wt = w;
      }
   }

   public static void CreateGraph(ArrayList<Edge> Graph[]){
      
    Graph[0].add(new Edge(0, 1, 1));
    Graph[0].add(new Edge(0, 2, 1));
    Graph[1].add(new Edge(1, 0, 1));
    Graph[1].add(new Edge(1, 3, 1));
    Graph[2].add(new Edge(2, 0, 1));
    Graph[2].add(new Edge(2, 4, 1));
    Graph[3].add(new Edge(3, 1, 1));
    Graph[3].add(new Edge(3, 5, 1));
    Graph[3].add(new Edge(3, 4, 1));
    Graph[4].add(new Edge(4, 2, 1));
    Graph[4].add(new Edge(4, 3, 1));
    Graph[4].add(new Edge(4, 3, 1));
    Graph[5].add(new Edge(5, 3, 1));
    Graph[5].add(new Edge(5, 4, 1));
    Graph[5].add(new Edge(5, 6, 1));
     Graph[6].add(new Edge(6, 5, 1));
      // Graph[5].add(new Edge(5, 6, 1));

   for(int i=0; i<Graph[5].size(); i++){
     Edge e = Graph[5].get(i);
       System.out.println(e.desti);
   }

        
 }
 public static void BFS(ArrayList<Edge> Graph[]){
     Queue<Integer> Q = new LinkedList<>();
     boolean visited[] = new boolean[Graph.length];
     Q.add(0);
         
     while(!Q.isEmpty()){
       int curr = Q.remove();
       if(!visited[curr]){
           System.out.println(curr+" ");
           visited[curr] = true;
           for(int i=0; i<Graph[curr].size(); i++){
             Edge e = Graph[curr].get(i);
              Q.add(e.desti);
           }
       }
     }
 }
  public static void DFS(ArrayList<Edge> Graph[], boolean visited[]){
      Queue<Integer> Q = new LinkedList<>();
      Q.add(0);
       while(!Q.isEmpty()){
         int curr = Q.remove();
         if(!visited[curr]){
           System.out.println(curr);
            visited[curr] = true;
            for(int i=0; i<Graph[curr].size(); i++){
               Edge e = Graph[curr].get(i);
               if(!visited[e.desti]){
                 Q.add((DFS(Graph, visited).get[i]);
               }
            }
               
             }
         }
       }

  }
   public static void main(String[] args) {
     int v = 7;
     ArrayList<Edge> Graph[] = new ArrayList[v];
     for(int i=0; i<Graph.length; i++){
       Graph[i] = new ArrayList<>();
     }
     CreateGraph(Graph);
     System.out.println();
    BFS(Graph);

   }
}