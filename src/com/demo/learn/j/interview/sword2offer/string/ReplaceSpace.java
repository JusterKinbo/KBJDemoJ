package com.demo.learn.j.interview.sword2offer.string;

/*
 * Qestion
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 * 测试demo
 * Solution solution = new Solution();
 * StringBuffer buffer = new StringBuffer("we are happy");
 * */
public class ReplaceSpace {

	public String replaceSpace(StringBuffer str) {
		
		if (null == str || str.length() < 1)
			return str.toString();
		int originalLenth = str.length();
		int numberOfBlank = 0;
		for (int i = 0; i < originalLenth; i++) {
			if (str.charAt(i) == ' ')
				numberOfBlank++;
		}

		int modifiedLength = originalLenth + (numberOfBlank << 1);
		char[] chars = new char[modifiedLength];

		int indexOfOriginal = originalLenth;
		int indexOfNew = modifiedLength;
		while (indexOfOriginal > 0 && indexOfNew >= indexOfOriginal) {
			if (str.charAt(--indexOfOriginal) == ' ') {
				chars[--indexOfNew] = '0';
				chars[--indexOfNew] = '2';
				chars[--indexOfNew] = '%';
			} else {
				chars[--indexOfNew] = str.charAt(indexOfOriginal);
			}
		}
		String string = new String(chars);
		return string;
	}
}
