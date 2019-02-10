package com.demo.learn.j.interview.sword2offer.list;

import java.util.ArrayList;
import java.util.Stack;

import com.demo.learn.j.interview.sword2offer.node.ListNode;

/*
 * Qestion
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 *
 * 测试demo
 * nil
 * */

public class PrintListFromTailToHead {

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		if (null == listNode) {
			return arrayList;
		}
		ListNode head = listNode;
		Stack<Integer> stack = new Stack<Integer>();
		while (null != head) {
			stack.push(head.val);
			head = head.next;
		}
		
		while (!stack.isEmpty()) {
			arrayList.add(stack.pop());
		}
		return arrayList;

	}
	
}
