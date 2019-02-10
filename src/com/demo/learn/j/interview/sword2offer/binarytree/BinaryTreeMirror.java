package com.demo.learn.j.interview.sword2offer.binarytree;

import com.demo.learn.j.interview.sword2offer.node.TreeNode;

/*
 * Qestion
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 
 * 二叉树的镜像定义：源二叉树 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 * */

public class BinaryTreeMirror {
	
	public void Mirror(TreeNode root) {
		if (null == root)
			return;

		TreeNode leftNode = root.left;
		TreeNode rightNode = root.right;

		Mirror(leftNode);

		Mirror(rightNode);

		root.left = rightNode;
		root.right = leftNode;

	}

}
