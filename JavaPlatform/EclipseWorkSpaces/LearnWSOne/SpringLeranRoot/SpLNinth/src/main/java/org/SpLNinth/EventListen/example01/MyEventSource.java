package org.SpLNinth.EventListen.example01;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import org.SpLNinth.EventListen.example2.CusEventListener;

class MyEventSource {
	private List listeners = new Vector();
	
	//要监控的元素
	private String sName = "tyz";
	
	private String result = "";

	public MyEventSource( ) {
		
	}
	
	public MyEventSource(TyzEventListener listener) {
		listeners.add(listener);
	}

	public void AddnewListener(TyzEventListener listener) {
		listeners.add(listener);
	}

	public void deleteMyEventListener(TyzEventListener listener) {
		
	}


	public void setName(String str) {
		
		if(str.equals(sName))
		{
			result = "我没有改变";
		}else
		{
			result = "我变了 From" + sName + "-- to -->" + str ;
			sName = str;
		}
		
		
		NotifyToHandle();
	}

	private void NotifyToHandle() {
		// TODO 自动生成的方法存根
		TyzEventListener thelistens = null;  
        Iterator<TyzEventListener> iterator = listeners.iterator();  
  
		while (iterator.hasNext()) {
			// 在类中实例化自定义的监听器对象,并调用监听器方法
			thelistens = iterator.next();
			thelistens.TyzhandleEvent(new MyEvent(result));
			
		}
	}

	public String getsName() {
		return sName;
	}
}
