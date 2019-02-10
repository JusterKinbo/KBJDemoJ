package com.demo.learn.j.interview.sword2offer.array;

/*
 * Qestion
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * 测试demo
 * int[][] arr1 = {{1,2,3},{2,3,4},{3,4,5}};
 * int target = 6;
 * */

public class FindInTwoDimensionalArray {
	
	public boolean Find(int target, int[][] array) {

		if (null == array || array.length < 1) {
			return false;
		}
		if (array[0].length < 1) {
			return false;
		}

		int rowLength = array.length;
		int colLength = array[0].length;

		int indexOfRow = 0;
		int indexOfCol = colLength - 1;

		while (indexOfCol >= 0 && indexOfRow < rowLength) {
			if (array[indexOfRow][indexOfCol] == target) {
				return true;
			} else if (array[indexOfRow][indexOfCol] > target) {
				indexOfCol--;
			} else if (array[indexOfRow][indexOfCol] < target) {
				indexOfRow++;
			}
		}

		return false;

	}

}
