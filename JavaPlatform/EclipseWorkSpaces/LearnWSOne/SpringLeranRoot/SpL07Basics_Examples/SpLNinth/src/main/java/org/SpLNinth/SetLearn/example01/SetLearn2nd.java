package org.SpLNinth.SetLearn.example01;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.SpLNinth.TyzCommons;

public class SetLearn2nd {

	//TreeSet 集合是用来对象元素进行排序的,同样他也可以保证元素的唯一
	public Set<String> m_treeset = new TreeSet<String>();
	public Set<String> m_treesetcompare = new TreeSet<String>(new CompareByLen());

	public static void main(String[] args) {

		SetLearn2nd eg = new SetLearn2nd();
		eg.Setinit(20);

		System.out.println("------************************-------");

		eg.print01();

		System.out.println("------***********print01_1*************-------");
		
		eg.print01_1();

		System.out.println("------***********print01_1*************-------");

		eg.print02();

		System.out.println("------************************-------");

		eg.print03();

		System.out.println("------************************-------");

	}

	public void Setinit(int length) {
		String str = "";
		for (int i = 0; i < length; i++) {
			str = TyzCommons.getRandomString2(new Random().nextInt(length / 3) + 3);
			m_treeset.add(str);
			m_treesetcompare.add(str);
		}
	}

	/**
	 * @param set
	 */
	public void print01() {
		Iterator<String> it = m_treeset.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}
	
	/**
	 * @param set
	 */
	public void print01_1() {
		Iterator<String> it = m_treesetcompare.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
	}

	public void print02() {
		// TODO 自动生成的方法存根
		for (String str : m_treeset) {
			System.out.println(str);
		}
	}

	public void print03() {
		// TODO 自动生成的方法存根
		String[] strary = new String[m_treeset.size()];
		m_treeset.toArray(strary);

		for (int i = 0; i < m_treeset.size(); i++) {
			System.out.println(strary[i]);
		}

	}
	
	//定义一个类，实现Comparator接口，并重写compare()方法，
	class CompareByLen /*extends Object*/ implements Comparator<String> {

	    @Override
	    public int compare(String s1, String s2) {        //按照字符串的长度比较
	        int num = s1.length() - s2.length();        //长度为主要条件
	        return num == 0 ? s1.compareTo(s2) : num;    //内容为次要条件
	    }
	}

}
