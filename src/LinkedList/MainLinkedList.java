package LinkedList;
import java.util.*;

public class MainLinkedList {
    public static void main(String[] args){
        List<Integer> ll = new LinkedList<>();
        List<Integer> al = new ArrayList<>();
//        ll.add(44);
//        ll.add(12);
//        ll.add(49);
//        System.out.println(ll);
        long arr = getTimeDiff(al);
        long llst = getTimeDiff(ll);
        diffRes(arr, llst);

    }
        static long getTimeDiff(List<Integer> list){
        long start = System.currentTimeMillis();
        for(int i=0; i<100000; i++){
            list.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println(list.getClass().getName() +" --> "+ (end - start));
        return (end - start);
    }
    static void diffRes(long arr, long llst){
        if(arr<llst){
            System.out.println("array is faster");
        }
        else{
            System.out.println("linkedList is faster");
        }
    }
}
