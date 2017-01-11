package cn.cao.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by hasee on 2016/12/21.
 */
public class SynchronizedThread {

    class Bank {

        private int account = 100;

        private Lock lock=new ReentrantLock();


        public int getAccount() {
            return account;
        }

        /**
         * 用同步方法实现
         *
         * @param money
         */
        public  void save(int money) {
            lock.lock();
            try {
                account += money;
            }finally {
                lock.unlock();
            }
        }

        /**
         * 用同步代码块实现
         *
         * @param money
         */
        public  void save1(int money) {
            synchronized (this) {
                account += money;
            }
        }
    }

    class NewThread implements Runnable {
   /*     private Bank bank;

        public NewThread(Bank bank) {
            this.bank = bank;
        }*/
        private int a = 10;
        @Override
        public void run() {

            for (int i = 0; i < 20; i++) {
                if (a>0){
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(i + "账户余额为：" + a--);
                }

            }
        }

    }

    /**
     * 建立线程，调用内部类
     */
    public void useThread() {
        Bank bank = new Bank();
        NewThread new_thread = new NewThread();
        System.out.println("线程1");
        Thread thread1 = new Thread(new_thread);
        thread1.start();
        System.out.println("线程2");
        Thread thread2 = new Thread(new_thread);
        thread2.start();
    }

    public static void main(String[] args) {
        SynchronizedThread st = new SynchronizedThread();
        st.useThread();
    }
}
