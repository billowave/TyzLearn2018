package org.SpLNinth.EventListen.example01;

import java.util.EventObject;

//自定义的事件状态对象类
@SuppressWarnings("serial")
class MyEvent extends EventObject {
	
	private Object obj;
	// 此监听对象可以是自定义对象
	private String sName;

	public MyEvent(Object source, String sName) {
		super(source);
		this.obj = source;
		this.sName = sName;
	}

	public MyEvent(String result) {
		// TODO 自动生成的构造函数存根
		super(result);
		obj = result;
	}

	public Object getObj() {
		return obj;
	}

	public String getsName() {
		return sName;
	}
}
