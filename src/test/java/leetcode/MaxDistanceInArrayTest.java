package leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxDistanceInArrayTest {

    @Test
    public void testFindMaxDistance() throws Exception {
        int a[] = {14,3,5,7,18,10};
        MaxDistanceInArray maxDistanceInArray = new MaxDistanceInArray();
        System.out.println(maxDistanceInArray.findMaxDistance(a));
    }
}