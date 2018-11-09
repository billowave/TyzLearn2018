package org.SpLNinth.EventListen.example01;

import java.util.HashMap;
import java.util.Map;

public class test2 {
	public static void main(String args[]) {
			
		MyEventSource src = new MyEventSource();
		
		src.AddnewListener(new Tyzlistener());
		
		
		src.setName("111");
		src.setName("222");
		src.setName("333");
		src.setName("444");
		src.setName("444");
	
	}
}