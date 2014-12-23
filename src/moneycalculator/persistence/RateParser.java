package moneycalculator.persistence;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RateParser {

    private BufferedReader reader;

    public RateParser(String path) {
        try {
            this.reader = new BufferedReader(new FileReader( path));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RateParser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
}
