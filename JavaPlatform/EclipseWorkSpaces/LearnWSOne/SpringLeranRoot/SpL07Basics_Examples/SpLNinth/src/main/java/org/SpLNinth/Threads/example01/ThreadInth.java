package org.SpLNinth.Threads.example01;

public class ThreadInth {

	public static void main(String[] args) {

		ThreadInth ss = new ThreadInth();
		DoWork dw = ss.new DoWork();
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(dw, "thread" + i);
			t.start();

			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println("-------My Name is " + Thread.currentThread().getName() + " ; My Id is "
					+ Thread.currentThread().getId());


		}

	}

	class DoWork implements Runnable {

		public void run() {
			for (int i = 1; i < 10; i++) {
				try {
					Thread.sleep(10000);
					System.out.println("-------My Name is " + Thread.currentThread().getName() + " ; My Id is "
							+ Thread.currentThread().getId() + " ; My Parent is Main");
					new Thread(new TyzIn(), Thread.currentThread().getName() + "--" + i + "-->").start();

				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}

			}
		}

	}

}

class TyzIn implements Runnable {
	public void run() {
		do {
			System.out.println("*************My Parents Name is " + Thread.currentThread().getName() + " ; My Id is "
					+ Thread.currentThread().getId());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		} while (true);
	};
}
