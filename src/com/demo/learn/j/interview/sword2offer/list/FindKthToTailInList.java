package com.demo.learn.j.interview.sword2offer.list;

import com.demo.learn.j.interview.sword2offer.node.ListNode;

/*
 * Qestion
 * 输入一个链表，输出该链表中倒数第k个结点。
 *
 * 测试demo
 * 1,{1,2,3,4,5}
 * 对应输出应该为:
 * 5
 * */

public class FindKthToTailInList {

	public ListNode FindKthToTail(ListNode head, int k) {

		if (null == head || k < 1) {
			return null;
		}
		ListNode pAHeadNode = head;
		ListNode pBheadNode = head;
		for (int i = 0; i < k - 1; i++) {
			if (null == pAHeadNode.next) {
				return null;
			}
			pAHeadNode = pAHeadNode.next;
		}

		while (null != pAHeadNode.next) {
			pAHeadNode = pAHeadNode.next;
			pBheadNode = pBheadNode.next;
		}
		return pBheadNode;
	}
}
