package org.SpLNinth.EventListen.example01;

import java.util.EventListener;

//定义自定义监听器接口，继承EventListener
interface Tyz_LangEventListener extends TyzEventListener {
	void Lang(MyEvent me);
}
