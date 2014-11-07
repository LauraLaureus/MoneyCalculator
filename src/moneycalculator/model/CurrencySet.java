package moneycalculator.model;

import java.util.HashMap;

public class CurrencySet {

    private final HashMap<String, Currency> map;

    public CurrencySet(HashMap<String, Currency> map) {
        this.map = map;
    }
    
    public void add(String code, Currency currency){
        map.put(code,currency);
    }
    
    
}
