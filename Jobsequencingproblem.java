import java.util.ArrayList;
import java.util.Collections;

public class Jobsequencingproblem {



     static class job{
        int deadline;
        int profit;
        int idd;
      public job(int id, int x, int y){
        deadline = x;
        profit = y;
        idd = id;

      }
     }


    public static void main(String[] args) {
        int jobinfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<job> jobs = new ArrayList<>();

        for(int i=0; i<jobinfo.length; i++){
             jobs.add(new job(i, jobinfo[i][0], jobinfo[i][1]));

        }
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit-obj1.profit );

         ArrayList<Integer> seq = new ArrayList<>();
         int time =0;

         for(int i=0; i<jobs.size(); i++){
            job curr = jobs.get(i);
            if(curr.deadline >time){
                seq.add(curr.idd);
                time++;
            }
         }

         System.out.println("the no of the wordks"+seq.size());

         for(int i=0; i<seq.size(); i++){
            System.out.println(seq.get(i));
         }

    }
}
