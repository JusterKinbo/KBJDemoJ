package com.demo.learn.j.interview.sword2offer.Fibonacci;


/*
* 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
* n<=39
* */
public class FibnacciSum {
	
	public int Fibonacci(int n) {
		if(0 >= n) return 0;
		
		if (n < 3) {
			return 1;
		}
		
		int pre = 1;
		int cur = 1;
		int i = 3;
		int ans = 0;
		while(i++ <= n)
		{
			ans = pre + cur;
			pre = cur;
			cur = ans;
		}
		return ans;

    }

}
