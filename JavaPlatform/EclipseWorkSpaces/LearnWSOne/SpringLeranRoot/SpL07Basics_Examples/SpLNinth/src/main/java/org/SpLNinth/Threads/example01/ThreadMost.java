package org.SpLNinth.Threads.example01;

public class ThreadMost {

	class DoWork implements Runnable {

		public void run() {
			for (int i = 1; i < 10000;i++) {
				long milliSecond = System.currentTimeMillis();
				try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				if(i%300==0&&"thread1".equals(Thread.currentThread().getName())) {
				System.out.print(Thread.currentThread().getName() + "，milliSecond=" + i);// 输出循环次数和当前的系统时间
			    if(i%500== 0)System.out.println();}
				if(i%100==0&&"thread990".equals(Thread.currentThread().getName())) {
					System.out.print(Thread.currentThread().getName() + "，milliSecond=" + i);// 输出循环次数和当前的系统时间
				    if(i%500 == 0)System.out.println();}
			}
		}

	}

	public static void main(String[] args) {

		ThreadMost ss = new ThreadMost();
		DoWork dw = ss.new DoWork();
		for (int i = 0; i < 1000; i++) {
			Thread t = new Thread(dw, "thread" + i);
			t.start();
		}
	}

}
