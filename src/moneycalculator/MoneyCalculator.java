package moneycalculator;

import moneycalculator.control.ExchangeCommand;
import moneycalculator.model.CurrencySet;
import moneycalculator.persistence.CurrencySetLoader;

public class MoneyCalculator {
    
    private static CurrencySet currencySet;
    
    public static void main(String[] args) {
        currencySet = CurrencySetLoader.load();
        ExchangeCommand cmd = new ExchangeCommand(currencySet);
        cmd.execute();
    }
    
}
