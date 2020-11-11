package dev;

import dev.thread.MyThreadExt;
import dev.thread.MyThreadImpl;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();

        MyThreadExt myThreadExt = new MyThreadExt(counter);
        MyThreadImpl myThreadImpl = new MyThreadImpl(counter);
        Thread thread = new Thread(myThreadImpl);
        myThreadExt.start();
        thread.start();
    }
}
