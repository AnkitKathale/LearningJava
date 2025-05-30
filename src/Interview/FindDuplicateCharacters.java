package Interview;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String s="amma";
        char[] c=s.toCharArray();
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int count =1;

        for(int i=0;i<c.length;i++){
            if(!map.containsKey(c[i])){
                map.put(c[i],count);
            }else{
                map.put(c[i],map.get(c[i]+1));
            }
        }

    }
}
