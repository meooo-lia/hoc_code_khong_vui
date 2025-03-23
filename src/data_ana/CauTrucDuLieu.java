/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_ana;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author bibau
 */
public class CauTrucDuLieu {

    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        ArrayList<String> alist = new ArrayList<>();
        alist.add("duy");
        alist.add("Duccc");
        alist.get(0);
        LinkedList<String> llist = new LinkedList<>();
        llist.add("duc");
        llist.add("duy");
        llist.addFirst("Lia");
        llist.addLast("Duy nyc");
        llist.get(0);
        llist.getFirst();
        System.out.println(llist);
        Stack<String> slist = new Stack<>();
        slist.add("uwu");
        slist.add("wee");
        slist.add("warrr");
        slist.push("wow");
        slist.pop();
        Queue<String> qlist = new LinkedList<>();
        qlist.add("dda");
        qlist.add("gaa");
        qlist.add("hahha");
        qlist.poll();
        HashMap<Integer, String> hlist = new HashMap<>();
        hlist.put(1, "duy");
        hlist.put(2, "HAHA");
        hlist.get(2);
        System.out.println(hlist.get(2));
        HashSet<String> set = new HashSet<>();
        set.add("da");
        set.add("ewowe");
        set.add("wasrr");
        
        System.out.println(set);
        List<String> arrayList = new ArrayList <>(set);
        arrayList.get(1);
        System.out.println(        arrayList.get(1));
        
    }

}
