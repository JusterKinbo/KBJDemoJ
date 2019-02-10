package com.demo.learn.j.interview.sword2offer.binarytree;

import com.demo.learn.j.interview.sword2offer.node.TreeNode;


/*
* 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
* */
public class BinaryTreeHasSubTree {

	
	public boolean HasSubtree(TreeNode root1, TreeNode root2) {
		boolean result = false;
		if (null != root1 && null != root2) {
			
			result = DosTree1HasTree2(root1, root2);
			if (!result)
				result = HasSubtree(root1.left, root2);
			if (!result)
				result = HasSubtree(root1.right, root2);
		}
		return result;

	}

	public boolean DosTree1HasTree2(TreeNode root1, TreeNode root2) {
		if (null == root2) {
			return true;
		}
		if (null == root1) {
			return false;
		}

		if (root1.val != root2.val) {
			return false;
		}
		return DosTree1HasTree2(root1.left, root2.left) && DosTree1HasTree2(root1.right, root2.right);

	}
}
