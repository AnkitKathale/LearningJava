package Interview;

import java.util.HashMap;
import java.util.Map;

public class CountWords {
    public static void main(String[] args) {
        String s1="I want to get want out of this jobless this phase I I";
        Map<String,Integer> map = new HashMap<String, Integer>();
        Integer count=1;
        String[] str = s1.split(" ");
        for(int i = 0;i<str.length;i++)
        {
            if(!map.containsKey(str[i])){
                map.put(str[i],count);

            }else{
                map.put(str[i],map.get(str[i])+1);
            }


        }
        for(String x: map.keySet()){
            System.out.println("COUNT OF WORD "+x+" is "+map.get(x));

        }
        System.out.println(map);
    }
}
