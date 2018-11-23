package com.tradertransactionsystem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainClass {

    public static void main(String[] args){

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
                );

        transactions.stream().filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        transactions.stream().map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

        transactions.stream().map(Transaction::getTrader)
                .filter(trader -> "Cambridge".equals(trader.getCity()))
                .sorted(Comparator.comparing(Trader::getName))
                .distinct()
                .forEach(System.out::println);

        String traderNames = transactions.stream().map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .reduce((a, b) -> a+b)
                .get();

        System.out.println(traderNames);

        boolean inMilan = transactions.stream().map(Transaction::getTrader)
                .anyMatch(trader -> "Milan".equals(trader.getCity()));

        System.out.println("Any trader based in Milan: "+inMilan);

        transactions.stream().filter(transaction -> "Cambridge".equals(transaction.getTrader().getCity()))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        transactions.stream().mapToInt(Transaction::getValue)
                .max()
                .ifPresent(System.out::println);

        transactions.stream().min(Comparator.comparing(Transaction::getValue))
                .ifPresent(System.out::println);
    }
}
