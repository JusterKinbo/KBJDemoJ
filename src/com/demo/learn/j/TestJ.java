package com.demo.learn.j;
import java.io.FileInputStream;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.demo.learn.j.interview.sword2offer.Solution;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.*;

public class TestJ {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Solution solution = new Solution();
		String  st = "fef";
		
		new TestJ().testCharArr(st);
		System.out.println(st);
		
		
    }
	
	public void testCharArr(String s) {
		s = "changed";
		System.out.println(s);
	}

}
