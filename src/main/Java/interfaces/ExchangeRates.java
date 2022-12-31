package interfaces;

import enums.Currency;
import enums.OperationType;

public interface ExchangeRates {
     double getExchangeRates(Currency currency, OperationType operationType);
}
