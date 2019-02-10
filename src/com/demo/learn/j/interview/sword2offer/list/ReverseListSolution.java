package com.demo.learn.j.interview.sword2offer.list;

import com.demo.learn.j.interview.sword2offer.node.ListNode;

/*
 * Qestion
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 * 测试demo
 * {1,2,3,4,5}
 * 对应输出应该为:
 * {5,4,3,2,1}
 * */

public class ReverseListSolution {

	public ListNode ReverseList(ListNode head) {
		if (null == head)
			return head;
		ListNode nexNode = head.next;// 旧表的头
		ListNode curNode = head;// 新表的头
		curNode.next = null;
		while (null != nexNode) {
			ListNode nexNodeOld = nexNode.next;
			nexNode.next = curNode;
			curNode = nexNode;
			nexNode = nexNodeOld;
		}

		return curNode;

	}

}
