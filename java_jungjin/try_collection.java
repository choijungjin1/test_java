import java.util.ArrayList;
import java.util.HashMap;

public class try_collection {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Item1"); list.add("Item2");
        list.add("Item3"); list.add("Item4");
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(49); list2.add(900);
        list2.add(123); list2.add(23);
        HashMap<Object, Object> hmap = new HashMap<Object, Object>();
        hmap.put("str", list);
        hmap.put("integer", list2);
        ArrayList<String> outlist01 = new ArrayList<String>();
        outlist01 = (ArrayList<String>) hmap.get("str");
        ArrayList<Integer> outlist02 = new ArrayList<Integer>();
        outlist02 = (ArrayList<Integer>) hmap.get("integer");

        for(int i=0; i<outlist01.size(); i++)
            System.out.println("list1:" +outlist01.get(i));
        for(int i=0; i<outlist02.size(); i++)
            System.out.println("list2:" +outlist02.get(i));
    }
}