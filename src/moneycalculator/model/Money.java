package moneycalculator.model;

public class Money {

    private final Currency currency;
    private final int amount;

    public Money() {
        this.currency = null;
        this.amount = 0;
    }

    public Currency getCurrency() {
        return currency;
    }

    public int getAmount() {
        return amount;
    }
    
    
    
}
