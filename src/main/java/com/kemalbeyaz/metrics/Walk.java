package com.kemalbeyaz.metrics;

import java.util.concurrent.TimeUnit;

public class Walk extends AbstractMove {

    @Override
    public void run() {
        move();
        move();
    }

    @Override
    public void move() {
        System.out.println("I'm walking...");

        for (int i = 0; i < 5; i++) {
            incStepCounter();

            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getCounterName() {
        return "walk_step_counter";
    }

    @Override
    public String getCounterHelp() {
        return "Walk step counter";
    }
}
