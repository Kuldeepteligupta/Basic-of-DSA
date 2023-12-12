public class New{


    public static void pascal(int r, int c){
       int res = 1;

       for(int i=0; i<c; i++){
         res = res*(r-i);
         res =res/(i+1);
       }
       System.out.print(res+" ");
    }
    public static void printrow(){
        int row = 4;
        for(int r=2; r<row; r++){
        for(int c = 2; c<=row; c++){
              pascal(row-1, c-1);
         }
         System.out.println();
        }
         
    }
      public static void main(String[] args) {
         int r=5;
         int c = 3;
        //  pascal(r-1, c-1);
        printrow();



      }
}