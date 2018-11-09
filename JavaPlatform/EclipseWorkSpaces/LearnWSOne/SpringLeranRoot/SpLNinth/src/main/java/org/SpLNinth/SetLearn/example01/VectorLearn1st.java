package org.SpLNinth.SetLearn.example01;


import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

import org.SpLNinth.TyzCommons;

public class VectorLearn1st {

	
	public Vector<String> m_vector = new Vector<String>();

	public void Vectorinit(int length) {

		for (int i = 0; i < length; i++) {
			
			m_vector.add(TyzCommons.getRandomString(new Random().nextInt(length / 3) + 3));
		}
	}

	/**
	 * @param set
	 */
	public void print01() {

		for (String str : m_vector) {
			System.out.println(str);
		}
		System.out.println("****************************************");
		// ------------------------------------------------------
	
		Iterator<String> iter = m_vector.iterator();
		for (; iter.hasNext();) {
			System.out.println(iter.next());
		}
		System.out.println("****************************************");
		// -----------------------------------------------------


	}

	public static void main(String[] args) {

		VectorLearn1st eg = new VectorLearn1st();
		eg.Vectorinit(10);

		System.out.println("------************************-------");

		eg.print01();

		System.out.println("------************************-------");

	}

}
