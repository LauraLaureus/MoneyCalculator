package moneycalculator.persistence;

import java.sql.Connection;
import moneycalculator.model.CurrencySet;

public class CurrencySetLoader {
    
    private final Connection conn;

    public CurrencySetLoader(Connection conn) {
        this.conn = conn;
    }

    
    public CurrencySet load(){
        
        /*
        Crea un CurrencySet
        Lo llena con los currency de la base de datos 
        Lo devuelve
        */
        
        return null;
    }
}
