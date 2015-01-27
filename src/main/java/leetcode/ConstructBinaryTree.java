package leetcode;

import java.util.HashMap;

/**
 * Created by is on 15/1/27.
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 */
public class ConstructBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0; i<inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return buildRec(map, preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }

    private TreeNode buildRec(HashMap<Integer, Integer> map, int[] preorder, int ps, int pe, int[] inorder, int is, int ie) {
        if(ps>pe ) return null;

        TreeNode root = new TreeNode( preorder[ps] );

        if(ps==pe) return root;

        int i = map.get(preorder[ps]); //divide point. left is left subtree.

        int  leftLength = i - is;

        root.left = buildRec(map, preorder, ps+1, ps+leftLength, inorder, is, i-1);
        root.right = buildRec(map, preorder, ps+i-is+1, pe, inorder, i+1, ie);

        return root;
    }
}
