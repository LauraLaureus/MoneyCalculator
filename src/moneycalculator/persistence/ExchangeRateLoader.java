package moneycalculator.persistence;

import java.sql.Connection;
import moneycalculator.model.Currency;
import moneycalculator.model.Exchange;
import moneycalculator.model.ExchangeRate;

public class ExchangeRateLoader {
    
    private final  Connection conn ;

    public ExchangeRateLoader(Connection conn) {
        this.conn = conn;
    }

    
    public  ExchangeRate load (Exchange exchange){
        Currency to = exchange.getCurrency();
        
        return null;
    }
}
