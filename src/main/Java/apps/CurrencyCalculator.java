package apps;
import enums.Currency;
import enums.OperationType;
import interfaces.ExchangeRates;


public class CurrencyCalculator {
    private ExchangeRates exchangeRates;
    public CurrencyCalculator(ExchangeRates exchangeRates) {
        this.exchangeRates = exchangeRates;
    }
    public double calculateValue(Currency currency, OperationType operationType, double value) {
                return exchangeRates.getExchangeRates(currency, operationType) * value;
    }

}
