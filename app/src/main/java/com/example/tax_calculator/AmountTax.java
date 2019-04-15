package com.example.tax_calculator;

public class AmountTax {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double lowTax(){

        double res = amount/100;
        return res;
    }
    public double mediumTax(){
        double remain = amount-200000;
        double low = 200000/100;
        double medium = remain*15/100;
        double res = low + medium;
        return res;
    }
    public double highTax(){
        double remainHigh = amount-350000;
        double remainingLow = remainHigh-200000;
        double low = 200000/100;
        double medium = remainHigh*15/100;
        double high = remainHigh*25/100;
        double res = low + medium + high;
        return res;
    }
}
