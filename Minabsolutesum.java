import java.util.Arrays;
public class Minabsolutesum {


    public static void main(String[] args) {
        int A[] = {1,2,3};
        int B[] = {2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);
        int minAbv = 0;
      
        for(int i=0; i<A.length; i++){
             minAbv = Math.abs(A[i]-B[i]);
                }
        System.out.println(minAbv);
    }
}
