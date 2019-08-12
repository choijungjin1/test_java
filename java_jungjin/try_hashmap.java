import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class try_hashmap {
    public static void main(String args[]) throws IOException {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(12, "Chaitanya"); hmap.put(2, "Rahul");
        hmap.put(7, "Singh"); hmap.put(49,"Ajeet"); hmap.put(3,"Anuji");
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("key:"+mentry.getKey()+"&Value:" +mentry.getValue());
        }
        for (Map.Entry<Integer, String> entry: hmap.entrySet()) {
            System.out.println("key:"+ entry.getKey()+ "&Value:" +entry.getValue());
        }
        for(Integer key : hmap.keySet()) {
            System.out.println("key:"+key+ "&Value:" +hmap.get(key));
        }
    }
}