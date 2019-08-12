import java.io.IOException;
import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String args[]) throws IOException {
        java.util.List<String> list = new ArrayList<String>();
        list.add("Item1");
        list.add("Item2");
        list.add("Item3");
        list.add("Item4");
        System.out.printf("The arraylist contains elements:" +list);
        System.out.printf("\n");
        int pos = list.indexOf("Item2");
        System.out.printf("The index of Item2 is: " + pos);
        System.out.printf("\n");
        System.out.printf("Checking is empty: " + list.isEmpty());
        System.out.printf("\n");
        int size = list.size();
        System.out.printf("The size of the list is: " +size);
        System.out.printf("\n");
        for(int i=0; i<list.size(); i++) {
            System.out.printf("Index: " +i+ " -Item: " +list.get(i));
            System.out.printf("\n");
        }
    }
}