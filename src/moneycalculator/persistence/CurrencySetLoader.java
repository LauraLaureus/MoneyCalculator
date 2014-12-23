package moneycalculator.persistence;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import moneycalculator.model.Currency;
import moneycalculator.model.CurrencySet;

public class CurrencySetLoader {
    
    private static final String path = "C:\\Users\\Laura\\Documents\\GitHub\\MoneyCalculator\\CurrencyList";
    private CurrencyReader reader;
    
    public CurrencySetLoader() {
            this.reader = new CurrencyReader(path);
    }

    
    public CurrencySet load(){
        
        CurrencySet result = new CurrencySet();
        Currency newCurrency;
       
        while(reader.hasCurrencies()){
            newCurrency = reader.getNextCurrency();
            result.add(newCurrency.getCode(), newCurrency);
        }
        
        
        return result;
    }
}
