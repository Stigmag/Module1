package com.nix.module1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {
 public BinaryTree binaryTreeInst;
    @Before
    public void before()
    {
        System.out.println("Before running...");
        binaryTreeInst= new BinaryTree();
    }

    @Test
    public void lenthOfTree() {
       BinaryTree.TreeNode tree=  new BinaryTree.TreeNode(1);
       tree=tree.right;



        tree=tree.left;


        int result=binaryTreeInst.lenthOfTree(tree);
        Assert.assertEquals(3,result);
    }
}