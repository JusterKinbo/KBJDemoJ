package com.demo.learn.j.interview.sword2offer;

import com.demo.learn.j.interview.sword2offer.node.TreeNode;

/*
 *
 * */

public class Solution {

	public boolean match(char[] str, char[] pattern) {
		if (null == str || null == pattern)
			return false;

		return matchCore(str, 0, pattern, 0);

	}

	public Boolean matchCore(char[] str, int indexOfStr, char[] pattern, int indexOfPattern) {
		if (str.length <= indexOfStr && pattern.length <= indexOfPattern) {
			return true;
		}
		if (str.length > indexOfStr && pattern.length <= indexOfPattern) {
			return false;
		}
		if (indexOfPattern + 1 < pattern.length && '*' == pattern[indexOfPattern + 1]) {
			if(indexOfStr >= str.length)
			{
				return matchCore(str, indexOfStr, pattern, indexOfPattern + 2);
			}
			else if (str[indexOfStr] == pattern[indexOfPattern]) {
				if (pattern[indexOfPattern] == str[indexOfStr] || '.' == pattern[indexOfPattern]) {
					return matchCore(str, indexOfStr + 1, pattern, indexOfPattern + 2)
							|| matchCore(str, indexOfStr + 1, pattern, indexOfPattern)
							|| matchCore(str, indexOfStr, pattern, indexOfPattern + 2);
				} else {
					return matchCore(str, indexOfStr, pattern, indexOfPattern + 2);
				}
			}
		}

		if (str[indexOfStr] == pattern[indexOfPattern] || '.' == pattern[indexOfPattern]) {
			return matchCore(str, indexOfStr + 1, pattern, indexOfPattern + 1);
		}

		return false;
	}

}
