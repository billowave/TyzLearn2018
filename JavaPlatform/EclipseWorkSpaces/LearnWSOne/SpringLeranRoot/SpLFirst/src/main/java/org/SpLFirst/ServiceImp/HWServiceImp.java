package org.SpLFirst.ServiceImp;

import org.SpLFirst.HelloWorld;
import org.SpLFirst.Service.HWService;

public class HWServiceImp implements HWService {

	private HelloWorld hw ;

	/**
	 * @return hw
	 */
	public HelloWorld getHw() {
		return hw;
	}
	/**
	 * @param hw 要设置的 hw
	 */
	public void setHw(HelloWorld hw) {
		this.hw = hw;
	}
	
	public HelloWorld gethw() {
		// TODO 自动生成的方法存根
		return getHw();
	}
}
