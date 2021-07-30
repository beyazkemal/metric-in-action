package com.kemalbeyaz.metrics;

import java.util.concurrent.TimeUnit;

public class Run extends AbstractMove {

    @Override
    public void move() {
        System.out.println("I'm runing...");

        for (int i = 0; i < 15; i++) {

            incStepCounter();

            try {
                TimeUnit.MILLISECONDS.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public String getCounterName() {
        return "run_step_counter";
    }

    @Override
    public String getCounterHelp() {
        return "Run step counter.";
    }
}
