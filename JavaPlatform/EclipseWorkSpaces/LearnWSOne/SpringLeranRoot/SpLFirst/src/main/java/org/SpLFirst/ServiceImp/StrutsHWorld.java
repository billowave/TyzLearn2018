package org.SpLFirst.ServiceImp;

import org.SpLFirst.HelloWorld;

public class StrutsHWorld implements HelloWorld{

	private String membera ;
	
	public void SayHelloW() {
		// TODO 自动生成的方法存根
		System.out.println("** Struts **Hello World !!");;
	}
	
	public String SayHelloStr() {
		// TODO 自动生成的方法存根
		return "** Struts **Hello World !!";
	}

	/**
	 * @return membera
	 */
	public String getMembera() {
		return membera;
	}

	/**
	 * @param membera 要设置的 membera
	 */
	public void setMembera(String membera) {
		this.membera = membera;
	}

}
