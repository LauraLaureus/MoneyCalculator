package moneycalculator;

import java.sql.Connection;
import moneycalculator.control.ExchangeCommand;
import moneycalculator.model.CurrencySet;
import moneycalculator.persistence.CurrencySetLoader;
import moneycalculator.persistence.OracleConnection;

public class MoneyCalculator {
    
    private static CurrencySet currencySet;
    private static final Connection conn = new OracleConnection().getConnection();
    
    
    public static void main(String[] args) {
        
        currencySet = new CurrencySetLoader(conn).load();
        
        ExchangeCommand cmd = new ExchangeCommand(currencySet);
        cmd.execute();
    }
    
}
