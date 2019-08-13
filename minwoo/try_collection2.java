import java.util.ArrayList;
import java.util.HashMap;

public class try_collection2 {
    public static void main(String args[]){
        ArrayList<Integer> mango = new ArrayList<Integer>();
        mango.add(39); mango.add(25); mango.add(30); mango.add(12); mango.add(40);

        ArrayList<Integer> apple = new ArrayList<Integer>();
        apple.add(48); apple.add(20); apple.add(10); apple.add(32);

        ArrayList<Integer> banana = new ArrayList<Integer>();
        banana.add(99); banana.add(23); banana.add(123);

        ArrayList<Integer> melon = new ArrayList<Integer>();
        melon.add(49); melon.add(22); melon.add(45); melon.add(12);

        HashMap<String,Object> hmap = new HashMap<String,Object>();
        hmap.put("Mango",mango);
        hmap.put("Apple",apple);
        hmap.put("Banana",banana);
        hmap.put("Melon",melon);

        for(String key : hmap.keySet()){
            ArrayList<Integer> outlist01 = new ArrayList<Integer>();
            outlist01 = (ArrayList<Integer>)hmap.get(key);
            System.out.printf(key+" : ");
            for(int i : outlist01){
                System.out.printf(i + " ");
            }
            System.out.printf("\n");
        }
    }
}