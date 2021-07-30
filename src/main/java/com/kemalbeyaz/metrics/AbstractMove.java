package com.kemalbeyaz.metrics;

import io.prometheus.client.Counter;

public abstract class AbstractMove implements Move, Runnable {

    private Counter stepCounter;

    void incStepCounter() {
        getCounter().inc();
    }

    @Override
    public void run() {
        move();
    }

    @Override
    public synchronized Counter getCounter() {

        if (stepCounter == null) {
            initializeCounter();
        }

        return stepCounter;
    }

    private void initializeCounter() {

        stepCounter = Counter.build()
                .name(getCounterName())
                .help(getCounterHelp())
                .register();
    }
}
