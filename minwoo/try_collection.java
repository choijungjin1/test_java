import java.util.ArrayList;
import java.util.HashMap;

public class try_collection {
    public static void main(String args[]){
        ArrayList<String> list1 = new ArrayList<String>();
        for(int i= 1 ; i<5 ; i++){
            list1.add("item"+i);
        }
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(49);
        list2.add(900);
        list2.add(123);
        list2.add(23);
        
        HashMap<Object,Object> hmap = new HashMap<Object,Object>();
        hmap.put("str",list1);
        hmap.put("integer",list2);
        
        ArrayList<Integer> outlist01 = new ArrayList<Integer>();
        outlist01 = (ArrayList<Integer>)hmap.get("integer");

        ArrayList<String> outlist02 = new ArrayList<String>();
        outlist02 = (ArrayList<String>)hmap.get("str");

        for(int i= 0 ; i<outlist01.size() ; i++){
            System.out.println("integer-"+ i +" : "+ outlist01.get(i));
        }
        System.out.printf("\n");
        for(int i= 0 ; i<outlist02.size() ; i++){
            System.out.println("str-"+i +" : "+outlist02.get(i));
        }
    }
}