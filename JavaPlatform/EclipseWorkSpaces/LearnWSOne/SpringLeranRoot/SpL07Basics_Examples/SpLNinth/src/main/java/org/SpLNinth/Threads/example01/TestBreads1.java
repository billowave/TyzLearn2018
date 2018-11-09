/**
 *@functon 线程通信之测试类 
 *@author 温煦（昵称：沉沦之巅）
 *@time 2017.12.5 
 */

package org.SpLNinth.Threads.example01;

public class TestBreads1 {
    
    public static void main(String[] args) {
        
        //new一个面包类
        Breads bre = new Breads();
        
        //new一个生产者类
        producer proth = new producer(bre,500);
        //new一个消费者类
        consume conth = new consume(bre,1000);
        
        //new三个包含消费者类的线程
        Thread t1 = new Thread(proth,"生产者1");
        Thread t3 = new Thread(proth,"生产者2");
        Thread t5 = new Thread(proth,"生产者3");
        
        //new三个包含生产者类的线程
        Thread t2 = new Thread(conth,"消费者1");
        Thread t4 = new Thread(conth,"消费者2");
        Thread t6 = new Thread(conth,"消费者3");
        
        //启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}