package leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class InsertSortedListTest {

    @Test
    public void testInsert() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0,3);
        list.add(1,5);
        System.out.println(list);
        InsertSortedList insert = new InsertSortedList();
        insert.insert(list,4);
        System.out.println(list);
    }
}