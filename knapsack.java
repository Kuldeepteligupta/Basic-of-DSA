import java.util.ArrayList;

public class knapsack{
    public static void main(String[] args) {
        int value[] = {60,100,120};
        int weight[] = {10,20,30};

        int ratio[][] = new int[value.length][2];
           for(int i=0; i<ratio.length; i++){
              ratio[i][0] = i;
              ratio[i][1] = value[i]/weight[i];
           }
          int ans  = 0;
           int capacity = 50;

           for(int i=0; i<value.length; i++){
              if(capacity >= weight[i]){
                 ans = ans+value[i];
                 capacity = capacity - weight[i];
              }
              else{
                ans = ans+ ratio[i][1] *capacity;
                break ;
              }
           }
           System.out.println("The ans is"+ans);
    }
}