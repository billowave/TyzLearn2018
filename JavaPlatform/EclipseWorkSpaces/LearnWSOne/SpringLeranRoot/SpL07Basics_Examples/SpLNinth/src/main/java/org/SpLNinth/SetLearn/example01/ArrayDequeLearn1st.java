package org.SpLNinth.SetLearn.example01;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;
import java.util.function.Consumer;

import org.SpLNinth.TyzCommons;

public class ArrayDequeLearn1st {

	ArrayDeque<String> m_arraydeque = new ArrayDeque<>();

	public void ArrayDequeinit(int length) {

		for (int i = 0; i < length; i++) {
			// m_arraydeque.push(TyzCommons.getRandomString(new Random().nextInt(length / 3)
			// + 3));
			m_arraydeque.add(TyzCommons.getRandomString(new Random().nextInt(length / 3) + 3));
		}
	}

	/**
	 * @param set
	 */
	public void print01() {

		for (String str : m_arraydeque) {
			System.out.println(str);
		}
		System.out.println("****************************************");
		// ------------------------------------------------------

		Iterator<String> iter = m_arraydeque.iterator();
		for (; iter.hasNext();) {
			System.out.println(iter.next());
		}

		// -----------------------------------------------------
		System.out.println("****************forEach************************");
		
		System.out.println("------------------forEach--1----------------");

		m_arraydeque.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		});
		
		System.out.println("------------------forEach--2----------------");

		m_arraydeque.forEach(System.out::println);
		
		System.out.println("------------------forEach--3----------------");

		
		m_arraydeque.forEach(cc -> System.out.println(cc));

		System.out.println("**************forEach**************************");

		// -----------------------------------------------------

		int size = m_arraydeque.size();
		for (int i = 0; i < size; i++) {
			System.out.println(m_arraydeque.pop());
		}
		System.out.println(m_arraydeque.size() + "****************************************");


	}

	public static void main(String[] args) {

		ArrayDequeLearn1st eg = new ArrayDequeLearn1st();
		eg.ArrayDequeinit(10);

		System.out.println("------************************-------");

		eg.print01();

		System.out.println("------************************-------");

	}

}
