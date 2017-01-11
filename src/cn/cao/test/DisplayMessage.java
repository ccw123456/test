package cn.cao.test;

/**
 * Created by hasee on 2016/12/21.
 */
public class DisplayMessage implements Runnable {
    private String message;

    public DisplayMessage(String message) {
        this.message = message;
    }

    public void run() {
       while (true){
           System.out.println(message);
       }
    }
}
