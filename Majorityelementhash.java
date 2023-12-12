import java.util.HashMap;
import java.util.Set;

public class Majorityelementhash{

  public static void main(String[] args) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int nums[] = {1,3,2,5,1,3,1,5};

    for(int i=0; i<nums.length; i++){
        // int num = nums[i];
        // if(map.containsKey(num)){
        //     map.put(num, map.get(num)+1);
        // }else{
        //     map.put(num, 1);
        // }
        map.put(nums[i], map.getOrDefault(nums[i],0)+1);
    }

    //  Set<Integer> keyset = map.keySet();
       int n = nums.length/3;
    for (int key : map.keySet()) {
         if(map.get(key)>n){
            System.out.println(key);
         }
    }
  }



}