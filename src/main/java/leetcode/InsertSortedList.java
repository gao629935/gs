package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by is on 15/1/19.
 * Given a node from a cyclic linked list which has been sorted, write a function to insert a value into
 * the list such that it remains a cyclic sorted list. The given node can be any single node in the list.
 */
public class InsertSortedList {
    public List<Integer> insert(List<Integer> list,Integer x){
        if (null == list){
            list = new ArrayList<Integer>();
            list.add(x);
        }
        for (int i = 0; i < list.size(); i++) {
            if (x >= list.get(i))
                list.add(i+1,x);
            break;
        }
        return list;
    }
}
