package org.SpLNinth.SetLearn.example01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.SpLNinth.TyzCommons;

public class MapLearn1st {

	public Map<String, String> map = new HashMap<String, String>();

	public void Mapinit(String prefix, int length) {

		for (int i = 0; i < length; i++) {

			map.put(prefix + i, TyzCommons.getRandomString(new Random().nextInt(length / 3) + 3));

		}
	}

	/**
	 * @param set
	 */
	public void print01() {

		// 键值打印
		Set<String> MapSetKey = map.keySet();
		for (String str : MapSetKey) {
			System.out.println(str);
		}
		System.out.println("****************************************");
		// ------------------------------------------------------
		// 值打印
		Collection<String> MapSetValues = map.values();
		Iterator<String> iter = MapSetValues.iterator();
		for (; iter.hasNext();) {
			String str = (String) iter.next();
			System.out.println(str);
		}
		System.out.println("****************************************");
		// -----------------------------------------------------
		// 键值与对应的值打印
		Set<Map.Entry<String, String>> entrys = map.entrySet();
		for (Map.Entry<String, String> entry : entrys) {
			String key = entry.getKey();
			Object value2 = entry.getValue();
			System.out.println(key + "=" + value2);
		}
	}
	
	public void print02() 
	{
		 //第一种：普遍使用，二次取值
	      System.out.println("通过Map.keySet遍历key和value：");
	      for (String key : map.keySet()) {
	       System.out.println("key= "+ key + " and value= " + map.get(key));
	      }
	      
	      //第二种
	      System.out.println("通过Map.entrySet使用iterator遍历key和value：");
	      Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
	      while (it.hasNext()) {
	       Map.Entry<String, String> entry = it.next();
	       System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
	      }
	      
	      //第三种：推荐，尤其是容量大时
	      System.out.println("通过Map.entrySet遍历key和value");
	      for (Map.Entry<String, String> entry : map.entrySet()) {
	       System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
	      }
	    
	      //第四种
	      System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
	      for (String v : map.values()) {
	       System.out.println("value= " + v);
	      }
	}

	public static void main(String[] args) {

		MapLearn1st eg = new MapLearn1st();
		eg.Mapinit("Key", 10);

		System.out.println("------************print01************-------");

		eg.print01();

		System.out.println("------***********print02*************-------");
		
		eg.print02();

		System.out.println("------************************-------");

	}

}
