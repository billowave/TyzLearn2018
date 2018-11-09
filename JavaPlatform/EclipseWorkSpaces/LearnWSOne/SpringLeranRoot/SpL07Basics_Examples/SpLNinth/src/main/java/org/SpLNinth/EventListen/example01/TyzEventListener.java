package org.SpLNinth.EventListen.example01;

import java.util.EventListener;

//定义自定义监听器接口，继承EventListener
interface TyzEventListener extends EventListener {
	void TyzhandleEvent(MyEvent me);
}
