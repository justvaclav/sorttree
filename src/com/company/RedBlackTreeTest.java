package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RedBlackTreeTest {

    @Test
    public void findParent() {
        RedBlackTree bst = new RedBlackTree();
        bst.insert(20);
        bst.insert(10);
        bst.insert(25);
        bst.insert(23);
        bst.insert(16);
        bst.insert(4);
        bst.insert(2);
        bst.insert(17);
        bst.insert(14);
        bst.insert(5);
        bst.insert(19);
        bst.insert(15);
        bst.insert(18);
        bst.insert(3);
        bst.insert(11);
        Assert.assertEquals(14, bst.getRoot().left.right.right.parent.data);
        Assert.assertEquals(20, bst.getRoot().right.right.parent.data);
        Assert.assertEquals(10, bst.getRoot().left.left.parent.data);
        Assert.assertEquals(20, bst.getRoot().right.left.parent.data);
        Assert.assertEquals(18, bst.getRoot().right.left.left.parent.data);
        bst.insert(29);
        bst.insert(35);
        bst.insert(28);
        bst.insert(36);
        bst.insert(31);
        Assert.assertEquals(14, bst.getRoot().left.right.right.parent.data);
        Assert.assertEquals(25, bst.getRoot().right.right.parent.data);
        Assert.assertEquals(10, bst.getRoot().left.left.parent.data);
        Assert.assertEquals(20, bst.getRoot().right.left.left.parent.data);
    }

    @Test
    public void findData() {
        RedBlackTree bst = new RedBlackTree();
        bst.insert(20);
        bst.insert(2);
        bst.insert(5);
        bst.insert(3);
        bst.insert(6);
        bst.insert(15);
        bst.insert(12);
        bst.insert(7);
        bst.insert(4);
        bst.insert(14);
        bst.insert(9);
        bst.insert(5);
        bst.insert(8);
        bst.insert(18);
        bst.insert(1);
        Assert.assertEquals(0, bst.getRoot().left.right.right.data);
        Assert.assertEquals(20, bst.getRoot().right.right.data);
        Assert.assertEquals(3, bst.getRoot().left.left.data);
        Assert.assertEquals(12, bst.getRoot().right.left.data);
        Assert.assertEquals(9, bst.getRoot().right.left.left.data);
        bst.insert(29);
        bst.insert(37);
        bst.insert(23);
        bst.insert(4);
        bst.insert(6);
        Assert.assertEquals(6, bst.getRoot().left.right.right.data);
        Assert.assertEquals(20, bst.getRoot().right.right.data);
        Assert.assertEquals(3, bst.getRoot().left.left.data);
        Assert.assertEquals(9, bst.getRoot().right.left.left.data);
    }
}