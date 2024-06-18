package javaFiles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


class ArrayLists {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        //add elements
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);


        //to get an element
        int element = list.get(0); // 0 is the index
        System.out.println(element);


        //add element in between
        list.add(1,55); // 1 is the index and 2 is the element to be added
        System.out.println(list);


        //set element
        list.set(0,0);
        System.out.println(list);


        //delete elements
        list.remove(0); // 0 is the index
        System.out.println(list);


        //size of list
        int size = list.size();
        System.out.println(size);


        //Loops on lists
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();


        //Sorting the list
        list.add(0);
        Collections.sort(list);
        System.out.println(list);

        List<String> list4 = new ArrayList<>();
        list4.add("Banana");
        list4.add("Apple");
        list4.add("Cherry");
        list4.add("Date");

        // Sorting the list in natural order
        list4.sort(Comparator.naturalOrder());

        // Printing the sorted list
        System.out.println(list4);

        // Sorting the list in reverse order
        list4.sort(Comparator.reverseOrder());

        // Printing the sorted list
        System.out.println(list4);

        LinkedList<Integer> l6=new LinkedList<>();
        l6.add(4);
        System.out.println(l6.size());
    }
}
