package apps;

import enums.Currency;
import enums.OperationType;
import interfaces.ExchangeRates;



public class CurrencyCalculator  {

    private ExchangeRates exchangeRates;

    public CurrencyCalculator(ExchangeRates exchangeRates){
        this.exchangeRates=exchangeRates;
    }



    public static double calculateValue(Currency currency, OperationType operationType,double value) {

        Mo

        switch (operationType) {
            case BUY:switch (currency){
                case USD : exchange
            }

                break;
            case SEL:
                break;
        }
    }

}
