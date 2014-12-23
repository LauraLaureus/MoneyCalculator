package moneycalculator.persistence;

import java.util.HashMap;

public class ExchangeRateMap {
    
    private  HashMap<String,Integer> map;
    private  RateParser rateParser;
    
    public ExchangeRateMap() {
        this.map = new HashMap<>();
        rateParser = new rateParser("C:\Users\Laura\Documents\GitHub\MoneyCalculator\ExchangeList");
    }
    
    
    
}
