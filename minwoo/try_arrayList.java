public class try_arrayList{
    public static void main(String args[]){
       java.util.ArrayList<String> list = new java.util.ArrayList<String>();
        for(int i= 1 ; i<5 ; i++){
            list.add("item"+i);
        }

        System.out.println("The arraylist contains elements: " + list);
        int pos = list.indexOf("item2");
        System.out.println("The index if item2 is : " + pos);
        System.out.println("Checking is empty: " + list.isEmpty());
        int size = list.size();
        System.out.println("The size of the list is: " + size);
        
        for(int i= 0 ; i<list.size() ; i++){
            System.out.println("Index : " + i +"-item:"+list.get(i));
        }
    }
}