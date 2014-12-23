package moneycalculator;

import java.util.Set;
import moneycalculator.control.ExchangeCommand;
import moneycalculator.model.CurrencySet;
import moneycalculator.persistence.CVSExchangeRateLoader;
import moneycalculator.persistence.CurrencySetLoader;

public class MoneyCalculator {
    
    private static CurrencySet currencySet;
    
    
    public static void main(String[] args) {
        
        currencySet = new CurrencySetLoader().load();
         //showTest();
        
        CVSExchangeRateLoader cvs = new CVSExchangeRateLoader();
        /*ExchangeCommand cmd = new ExchangeCommand(currencySet);
        cmd.execute();*/
    }
    
    private static  void showTest(){
        
        Set<String> codes = currencySet.getCodes();
        
        for (String code : codes) {
            System.out.println(code);
        }
    }
}
