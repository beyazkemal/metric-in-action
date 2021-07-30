package com.kemalbeyaz.metrics;

import io.prometheus.client.exporter.HTTPServer;

import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Action {

    public static void main(String[] args) {
        System.out.println("hello from metric demo!!");

        ArrayBlockingQueue<Runnable> arrayBlockingQueue = new ArrayBlockingQueue<>(2);
        ExecutorService executorService =
                new ThreadPoolExecutor(2, 4, 1, TimeUnit.MINUTES, arrayBlockingQueue);

        try {
            new HTTPServer(1234);

            var move = new Walk();
            var move2 = new Run();

            executorService.submit(move);
            executorService.submit(move2);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
