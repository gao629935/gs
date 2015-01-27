package leetcode;

/**
 * Created by is on 15/1/22.
 *Given an array A of integers, find the maximum of j-i subjected to the constraint of A[i] < A[j].
 * http://leetcode.com/2011/05/a-distance-maximizing-problem.html  没搞懂那个O（N）的算法
 */
public class MaxDistanceInArray {
    public int findMaxDistance(int a[]){
        if(a.length<=1)
            return 0;
        int distance = 0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] > a[i]){
                    distance = distance<j-i?j-i:distance;
                    break;
                }

            }
        }
        return distance;
    }

}
