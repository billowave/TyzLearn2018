package org.SpLNinth.SetLearn.example01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.SpLNinth.TyzCommons;

public class MapLearn2nd {

	public Map<String, String> m_treemap = new TreeMap<String, String>();

	public void Mapinit(String prefix, int length) {

		for (int i = 0; i < length; i++) {

			m_treemap.put(prefix + i, TyzCommons.getRandomString(new Random().nextInt(length / 3) + 3));

		}
	}

	/**
	 * @param set
	 */
	public void print01() {

		// 键值打印
		Set<String> MapSetKey = m_treemap.keySet();
		for (String str : MapSetKey) {
			System.out.println(str);
		}
		System.out.println("****************************************");
		// ------------------------------------------------------
		// 值打印
		Collection<String> MapSetValues = m_treemap.values();
		Iterator<String> iter = MapSetValues.iterator();
		for (; iter.hasNext();) {
			String str = (String) iter.next();
			System.out.println(str);
		}
		System.out.println("****************************************");
		// -----------------------------------------------------
		// 键值与对应的值打印
		Set<Map.Entry<String, String>> entrys = m_treemap.entrySet();
		for (Map.Entry<String, String> entry : entrys) {
			String key = entry.getKey();
			Object value2 = entry.getValue();
			System.out.println(key + "=" + value2);
		}
	}

	public void print02() {
		// 第一种：普遍使用，二次取值
		System.out.println("通过Map.keySet遍历key和value：");
		for (String key : m_treemap.keySet()) {
			System.out.println("key= " + key + " and value= " + m_treemap.get(key));
		}

		// 第二种
		System.out.println("通过Map.entrySet使用iterator遍历key和value：");
		Iterator<Map.Entry<String, String>> it = m_treemap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> entry = it.next();
			System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		}

		// 第三种：推荐，尤其是容量大时
		System.out.println("通过Map.entrySet遍历key和value");
		for (Map.Entry<String, String> entry : m_treemap.entrySet()) {
			System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		}

		// 第四种
		System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
		for (String v : m_treemap.values()) {
			System.out.println("value= " + v);
		}
	}

	/**
	 * @param set
	 */
	public void print03() {

		// 键值打印

		System.out.println("------------------forEach--2----------------");

		//m_treemap.forEach(System.out::println);


		System.out.println("------------------forEach--2----------------");

		// ------------------------------------------------------
		// 值打印

		System.out.println("------------------forEach--3----------------");

		m_treemap.forEach((cc,ss) -> System.out.println(cc + "++++" + ss));

		System.out.println("****************************************");
		// -----------------------------------------------------
		// 键值与对应的值打印
		System.out.println("------------------forEach--1----------------");

		m_treemap.forEach(new BiConsumer<String, String>() {

			@Override
			public void accept(String t1, String t2) {
				// TODO Auto-generated method stub
				System.out.println(t1 + "******" + t2);

			}
		});
	}

	public static void main(String[] args) {

		MapLearn2nd eg = new MapLearn2nd();
		eg.Mapinit("Key", 10);

		System.out.println("------************print01************-------");

		eg.print01();

		System.out.println("------***********print02*************-------");

		eg.print02();

		System.out.println("------*************print03***********-------");
		
		eg.print03();

		System.out.println("------*************print03***********-------");

	}

}
