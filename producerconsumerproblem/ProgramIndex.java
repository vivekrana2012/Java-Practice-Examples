package com.producerconsumerproblem;

public class ProgramIndex {
    public static void main(String args[]){

        Market market = new Market();

        Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    market.produce();
                }catch(InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    market.consume();
                }catch(InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
