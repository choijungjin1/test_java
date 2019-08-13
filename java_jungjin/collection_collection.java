import java.util.ArrayList;
import java.util.HashMap;

public class collection_collection {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango"); list.add("Apple"); list.add("Banana"); list.add("Melon");
        ArrayList<Integer> Mango = new ArrayList<Integer>();
        Mango.add(39); Mango.add(20); Mango.add(30); Mango.add(12); Mango.add(40);
        ArrayList<Integer> Apple = new ArrayList<Integer>();
        Apple.add(48); Apple.add(20); Apple.add(10); Apple.add(32);
        ArrayList<Integer> Banana = new ArrayList<Integer>();
        Banana.add(99); Banana.add(23); Banana.add(123);
        ArrayList<Integer> Melon = new ArrayList<Integer>();
        Melon.add(49); Melon.add(22); Melon.add(45); Melon.add(12);

        HashMap<Object, Object> hmap = new HashMap<Object, Object>();
        hmap.put("menu", list);
        hmap.put("Mango", Mango);
        hmap.put("Apple", Apple);
        hmap.put("Banana", Banana);
        hmap.put("Melon", Melon);

        ArrayList<String> outlist01 = new ArrayList<String>();
        outlist01 = (ArrayList<String>) hmap.get("menu");

        for(int i=0; i<outlist01.size(); i++){
            ArrayList<Integer> outlist = new ArrayList<Integer>();
            outlist = (ArrayList<Integer>) hmap.get(outlist01.get(i));
            System.out.printf(outlist01.get(i) + " : ");
            for(int j : outlist){
                System.out.printf(j+" ");
            }
            System.out.printf("\n");
        }
    }
}