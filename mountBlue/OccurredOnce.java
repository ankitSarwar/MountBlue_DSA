package mountBlue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class OccurredOnce {
    public static void main(String[] args) {
        int arr[] = {7, 7, 8, 8, 9, 1, 1, 4, 2, 2};
        int n = arr.length;
        HashMap<Integer,Integer>hm=new HashMap<>();

        for(int ele:arr){
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        }
//        for(Map.Entry<Integer,Integer>e:hm.entrySet()){
//            if(e.getValue()==1){
//                System.out.println(e.getKey());
//            }
//        }

        for(int key:hm.keySet()){
            if(hm.get(key)==1){
                System.out.println(key);
            }
        }

    }
}
