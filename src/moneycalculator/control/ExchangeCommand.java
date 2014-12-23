package moneycalculator.control;

import moneycalculator.gui.ExchangeDialog;
import moneycalculator.gui.MoneyDisplay;
import moneycalculator.model.CurrencySet;
import moneycalculator.model.Exchange;
import moneycalculator.model.ExchangeRate;
import moneycalculator.model.Money;
import moneycalculator.persistence.ExchangeRateLoader;
import moneycalculator.process.Exchanger;

public class ExchangeCommand {

    private CurrencySet currencyset;

    public ExchangeCommand(CurrencySet currencyset) {
        this.currencyset = currencyset;
    }
    
    public void execute(){
        ExchangeDialog eDialog = new ExchangeDialog();
        
        Exchange exchange = eDialog.getExchange();
        ExchangeRate rate = new ExchangeRateLoader()
        Money exchanged = Exchanger.exchange(exchange,rate);
        MoneyDisplay display = new MoneyDisplay(exchanged);
    }
}
