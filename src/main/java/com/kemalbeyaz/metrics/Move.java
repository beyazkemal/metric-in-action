package com.kemalbeyaz.metrics;

import io.prometheus.client.Counter;

public interface Move {

    void move();

    String getCounterName();

    String getCounterHelp();

    Counter getCounter();

}
