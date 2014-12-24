package moneycalculator.control;

import moneycalculator.model.CurrencySet;
import moneycalculator.persistence.CVSExchangeRateLoader;

public class ExchangeCommand {

    private CurrencySet currencyset;
    private CVSExchangeRateLoader cvs;

    public ExchangeCommand(CurrencySet currencyset, CVSExchangeRateLoader cvs) {
        this.currencyset = currencyset;
        this.cvs = cvs;
    }
    
    public void execute(){
        /*Llamar a la gui pasándole por parámetros las divisas y los cambios*/
    }
}
