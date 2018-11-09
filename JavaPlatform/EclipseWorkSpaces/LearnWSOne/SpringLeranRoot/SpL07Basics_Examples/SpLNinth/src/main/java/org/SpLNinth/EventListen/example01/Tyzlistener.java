package org.SpLNinth.EventListen.example01;


class Tyzlistener implements Tyz_YzEventListener {



	@Override
	public void Yz(MyEvent me) {
		
		// TODO 自动生成的方法存根
		
		System.out.println("Tyz_YzEventListener-->Tyzlistener-->Yz");
		
	}

	@Override
	public void TyzhandleEvent(MyEvent event) {

		System.out.println("Tyz_YzEventListener-->Tyzlistener-->Yz");
		System.out.println(event.getObj());
		
		
	}
}
