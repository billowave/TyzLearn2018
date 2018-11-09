package org.SpLNinth.SetLearn.example01;


import java.util.Iterator;
import java.util.Random;
import java.util.Stack;
import java.util.function.Consumer;

import org.SpLNinth.TyzCommons;

public class StackLearn1st {

	public Stack<String> m_stack = new Stack<String>();

	public void Stackinit(int length) {

		for (int i = 0; i < length; i++) {
			// m_stack.add(TyzCommons.getRandomString(new Random().nextInt(length / 3) +
			// 3));

			m_stack.push(TyzCommons.getRandomString(new Random().nextInt(length / 3) + 3));

		}

	}

	public void print01() {

		System.out.println("------************************-------");

		// 第一种遍历方法使用foreach遍历List
		for (String str : m_stack) { // 也可以改写for(int i=0;i<list.size();i++)这种形式
			System.out.println(str);
		}

		System.out.println("------************************-------");

		// 第二种遍历，把链表变为数组相关的内容进行遍历
		String[] strArray = new String[m_stack.size()];
		m_stack.toArray(strArray);
		for (int i = 0; i < strArray.length; i++) // 这里也可以改写为 foreach(String str:strArray)这种形式
		{
			System.out.println(strArray[i]);
		}

		System.out.println("------************************-------");
		// 第三种遍历 使用迭代器进行相关遍历

		Iterator<String> ite = m_stack.iterator();
		while (ite.hasNext())// 判断下一个元素之后有值
		{
			System.out.println(ite.next());
		}
		
		System.out.println("------************************-------");
		System.out.println("------------------forEach--1----------------");

		m_stack.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		});
		
		System.out.println("------------------forEach--2----------------");

		m_stack.forEach(System.out::println);
		
		System.out.println("------------------forEach--3----------------");

		
		m_stack.forEach(cc -> System.out.println(cc));

		System.out.println("**************forEach**************************");

		// -----------------------------------------------------
		
		// -----------------------------------------------------

		int size = m_stack.size();
		for (int i = 0; i < size; i++) {
			System.out.println(m_stack.pop());
		}
		System.out.println(m_stack.size() + "****************************************");

		
	}

	public static void main(String[] args) {

		StackLearn1st eg = new StackLearn1st();
		eg.Stackinit(12);
		eg.print01();

	}

}
