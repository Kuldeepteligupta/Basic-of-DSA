import java.util.Arrays;

public class Indiancoins {
    public static void main(String[] args) {
        int coins[] = {1,2,5,10,20,50,100,500,1000,2000};

        Arrays.sort(coins);

        int nocoins = 0;
        int Amt = 100000;

        for(int i=coins.length-1; i>=0; i--){
            if( coins[i] <= Amt){
              while(coins[i] <= Amt){
                nocoins++;
                Amt = Amt-coins[i];
              }  
            }
            
        }
        System.out.println(nocoins);

    }
}
