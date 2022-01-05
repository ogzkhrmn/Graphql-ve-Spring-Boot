package com.hero.example.model;

import java.time.LocalDate;

public class StockPrice {
    private String symbol;
    private double price;
    private LocalDate timestamp;

    public StockPrice(String symbol, double price, LocalDate timestamp) {
        this.price = price;
        this.symbol = symbol;
        this.timestamp = timestamp;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }
}
