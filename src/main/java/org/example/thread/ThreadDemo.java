package org.example.thread;

import java.util.logging.Logger;

public class ThreadDemo {
    public static void main(String args[]){
        MyThread myThread = new MyThread();

        myThread.run();
        myThread.start();
    }
}

class MyThread extends Thread{


}
