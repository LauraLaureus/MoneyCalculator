package moneycalculator.gui.swing;

import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator.model.Money;

public class MoneyDisplay extends JPanel {

    
    public MoneyDisplay(){
        this.add(createMoneyLabel(), 0 );
    }

    private JLabel createMoneyLabel() {
        JLabel moneyDisplayer = new JLabel();
        moneyDisplayer.setText("Convertion");
        moneyDisplayer.setEnabled(false);
        moneyDisplayer.setVisible(true); 
        return moneyDisplayer;
    }
    
    public void setMoney(Money money){
        String text = money.getAmount() + money.getCurrency().getSymbol();
        JLabel label =((JLabel)this.getComponent(0));
        label.setText(text);
        label.repaint();        
    }
}
