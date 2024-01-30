package org.example;
import java.util.logging.Logger;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        for (int i = 1; i <= 10; i++) {
            logger.info(String.format("sumCalculator(%d) = %d",i, sumCalculator.sum(i)));
        }
    }
}