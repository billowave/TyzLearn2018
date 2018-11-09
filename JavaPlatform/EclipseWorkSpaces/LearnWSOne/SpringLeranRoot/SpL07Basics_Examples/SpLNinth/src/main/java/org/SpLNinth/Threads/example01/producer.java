/**
 *@functon 线程通信之生产类（继承Thread类） 
 *@author 温煦（昵称：沉沦之巅）
 *@time 2017.12.5 
 */

package org.SpLNinth.Threads.example01;

public class producer extends Thread{
    
    //获得面包的类
	  private Breads bre ;
	  private int time_ms ;

    //无参构造
    public producer() {
        super();
    }

    //有参构造
    public producer(Breads bre,int ms) {
        super();
        this.bre = bre;
        this.time_ms = ms;
    }


    //set和get方法
    public Breads getBre() {
        return bre;
    }

    public void setBre(Breads bre) {
        this.bre = bre;
        
    }

    //继承重写run方法
    @Override
    public void run() {
        pro();
    }
    
    //生产面包
    private void pro() {
        // 本系统默认循环生产20个面包
        for (int i = 0; i <20; i++) {
            try {
                Thread.currentThread();
				//沉睡0.3秒（演示效果需要，可以不加）
                Thread.sleep(time_ms);
            } catch (InterruptedException e) {         
                e.printStackTrace();
            }
            //调用面包类里的生产面包的方法
            bre.produc();
        }
    }

	public int getTime_ms() {
		return time_ms;
	}

	public void setTime_ms(int time_ms) {
		this.time_ms = time_ms;
	}
}