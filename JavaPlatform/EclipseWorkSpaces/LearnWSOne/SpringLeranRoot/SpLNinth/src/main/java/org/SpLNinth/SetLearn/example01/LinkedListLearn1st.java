package org.SpLNinth.SetLearn.example01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

import org.SpLNinth.TyzCommons;

public class LinkedListLearn1st {
	
	LinkedList<String> m_linkedlist = new LinkedList<String>();

	public static void main(String[] args) {

		LinkedListLearn1st eg = new LinkedListLearn1st();
		eg.LinkedListinit(10);

		System.out.println("------************************-------");

		eg.print01();

		System.out.println("------************************-------");

		eg.print02();

		System.out.println("------************************-------");

		eg.print03();

		System.out.println("------************************-------");
		

	}

	public void LinkedListinit(int length) {
		for (int i = 0; i < length; i++) {
	
			m_linkedlist.add(TyzCommons.getRandomString2(new Random().nextInt(length / 3) + 3));
	
		}
	}

	/**
	 * @param set
	 */
	public void print01() {

		Iterator<String> it = m_linkedlist.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}

	public void print02() {
		// TODO 自动生成的方法存根
		for (String str : m_linkedlist) {
			System.out.println(str);
		}
	}

	public void print03() {
		// TODO 自动生成的方法存根
		String[] strary = new String[m_linkedlist.size()];
		m_linkedlist.toArray(strary);

		for (int i = 0; i < m_linkedlist.size(); i++) {
			System.out.println(strary[i]);
		}
	}

}
