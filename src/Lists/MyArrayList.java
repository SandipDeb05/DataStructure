package Lists;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
public class MyArrayList {
    public static void main(String[] args){
        List <String> fruits = new ArrayList<>();
        List <String> vegetables = new LinkedList<>();
        // add(element)
        fruits.add("mango");
        fruits.add("Apple");
        vegetables.add("Potato");
        vegetables.add("Tomato");
        System.out.println(fruits);
        System.out.println(vegetables);
        // addAll(collection)
        fruits.addAll(vegetables);
        System.out.println(fruits);
        //get(index)
        System.out.println(fruits.get(3));
        // set(index, value)
        fruits.set(3,"Loki");
        System.out.println(fruits);
        // remove(index)
        fruits.remove(3);
        System.out.println(fruits);
        // removeAll()
        fruits.removeAll(vegetables);
        System.out.println(fruits);

        List<String> toRemove = new ArrayList<>();
        toRemove.add("mango");
        fruits.removeAll(toRemove);
        System.out.println(fruits);
        // clear()
        fruits.clear();
        System.out.println(fruits);
        //==============================
        fruits.add("mango");
        fruits.add("Apple");
        // size()
        System.out.println(fruits.size());
        // contains
        System.out.println(fruits.contains("mango"));
        //isEmpty()
        System.out.println(fruits.isEmpty());
        //toArray()
        String temp[] = new String[fruits.size()];
//        Object x[] = fruits.toArray();
        fruits.toArray(temp);
        for(String e: temp){
            System.out.println("THE ARRAY");
            System.out.println(e);
        }

//        Pair<String , Integer> p1 = new Pair("sandip", 44);
//        Pair<Boolean, String> p2 = new Pair( true, "Nikita");
//        p1.getDescription();
//        p2.getDescription();



    }
}
