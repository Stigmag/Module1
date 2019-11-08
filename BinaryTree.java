package com.nix.module1;

public class BinaryTree {
    public int lenthOfTree(TreeNode tree)
    {
        int result=0;
        if(tree==null) return 0;
        while(tree!=null)
        {result+=1;
        if(tree.right!=null)
        {tree=tree.right;
        result+=1;
        if(tree.right==null && tree.left!=null)
            tree=tree.left;
        result+=1;

        }


        }
        return result;
    }
    public static class TreeNode {
   int val;
   TreeNode left;
    TreeNode right;
     TreeNode(int x) { val = x; }
 }

}
