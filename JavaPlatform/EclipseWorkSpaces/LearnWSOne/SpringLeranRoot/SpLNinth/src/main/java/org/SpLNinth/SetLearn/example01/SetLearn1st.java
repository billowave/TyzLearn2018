package org.SpLNinth.SetLearn.example01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import org.SpLNinth.TyzCommons;

public class SetLearn1st {

	public Set<String> set = new HashSet<String>();

	public static void main(String[] args) {

		SetLearn1st eg = new SetLearn1st();
		eg.Setinit(10);

		System.out.println("------************************-------");

		eg.print01();

		System.out.println("------************************-------");

		eg.print02();

		System.out.println("------************************-------");

		eg.print03();

		System.out.println("------************************-------");

	}

	public void Setinit(int length) {
		for (int i = 0; i < length; i++) {
	
			set.add(TyzCommons.getRandomString2(new Random().nextInt(length / 3) + 3));
		}
	}

	/**
	 * @param set
	 */
	public void print01() {
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}

	public void print02() {
		// TODO 自动生成的方法存根
		for (String str : set) {
			System.out.println(str);
		}
	}

	public void print03() {
		// TODO 自动生成的方法存根
		String[] strary = new String[set.size()];
		set.toArray(strary);

		for (int i = 0; i < set.size(); i++) {
			System.out.println(strary[i]);
		}
	}

}
