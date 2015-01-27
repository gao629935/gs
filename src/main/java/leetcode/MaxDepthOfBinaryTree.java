package leetcode;


import prepare.Node;

import java.util.LinkedList;

/**
 * Created by is on 15/1/21.
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaxDepthOfBinaryTree {
    /**
     * 递归实现
     * @param root
     * @return
     */
    public int MaxDepthByRercursive(Node root){
        if (root == null)
            return 0;
        return Math.max(MaxDepthByRercursive(root.getLeft()),
                MaxDepthByRercursive(root.getRight()))+1;
    }

    /**
     * 层序遍历搜索，相当于BFS（广度优先搜索）
     */
}
