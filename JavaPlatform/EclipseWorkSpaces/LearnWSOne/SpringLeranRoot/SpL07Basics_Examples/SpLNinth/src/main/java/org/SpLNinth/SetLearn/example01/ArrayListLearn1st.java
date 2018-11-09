package org.SpLNinth.SetLearn.example01;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import org.SpLNinth.TyzCommons;

public class ArrayListLearn1st {

	public ArrayList<String> m_arraylist = new ArrayList<String>();

	public void ArrayListinit(int length) {

		for (int i = 0; i < length; i++) {

			m_arraylist.add(TyzCommons.getRandomString(new Random().nextInt(length / 3) + 3));

		}

	}



	public void print01() {
		
		System.out.println("------************************-------");

		// 第一种遍历方法使用foreach遍历List
		for (String str : m_arraylist) { // 也可以改写for(int i=0;i<list.size();i++)这种形式
			System.out.println(str);
		}
		
		System.out.println("------************************-------");

		// 第二种遍历，把链表变为数组相关的内容进行遍历
		String[] strArray = new String[m_arraylist.size()];
		m_arraylist.toArray(strArray);
		for (int i = 0; i < strArray.length; i++) // 这里也可以改写为 foreach(String str:strArray)这种形式
		{
			System.out.println(strArray[i]);
		}

		System.out.println("------************************-------");
		// 第三种遍历 使用迭代器进行相关遍历

		Iterator<String> ite = m_arraylist.iterator();
		while (ite.hasNext())// 判断下一个元素之后有值
		{
			System.out.println(ite.next());
		}
		
		System.out.println("------**********sort*************-------");
		m_arraylist.sort((s1,s2)->s2.compareTo(s1));
		m_arraylist.forEach(c->System.out.println(c));
	}

	public static void main(String[] args) {

		ArrayListLearn1st eg = new ArrayListLearn1st();
		eg.ArrayListinit(12);
		eg.print01();



	}

}
