package dev.thread;

import dev.Counter;
import org.apache.log4j.Logger;

public class MyThreadImpl implements Runnable {
    private static final Logger logger =
            Logger.getLogger(MyThreadImpl.class);
    private Counter counter;

    public MyThreadImpl(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.increment();
            logger.info(Thread.currentThread().getName() + " value = "
                    + counter.getIncrementValue());
        }
    }
}
