package com.cryptoTracker.cryptoTracker.model;

public class CryptoCoin {
    private String id;
    private String name;
    private double price;
    private double change24hr;

    public CryptoCoin() {
    }

    public CryptoCoin(String id, String name, double price, double change24hr) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.change24hr = change24hr;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public double getChange24hr() { return change24hr; }
    public void setChange24hr(double change24hr) { this.change24hr = change24hr; }

    // --- Added for Thymeleaf template ---

    public String getFormattedPrice() {
        return String.format("%,.2f", this.price);
    }

    public String getRoundedChange() {
        return String.format("%.2f", this.change24hr);
    }

    public boolean isPositiveChange() {
        return this.change24hr >= 0;
    }
}