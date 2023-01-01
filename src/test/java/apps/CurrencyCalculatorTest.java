package apps;

import enums.Currency;
import enums.OperationType;
import interfaces.ExchangeRates;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

class CurrencyCalculatorTest {

    private ExchangeRates exchangeRates;

    private CurrencyCalculator objectUnderTest;

    @BeforeEach
    public void beforeEachTest() {
        exchangeRates = Mockito.mock(ExchangeRates.class);
        objectUnderTest = new CurrencyCalculator(exchangeRates);

    }

    @Test
    void shouldReturnGbpSellingValue() {
        //given
        Mockito.when(exchangeRates.getExchangeRates(Currency.GBP, OperationType.SEL)).thenReturn(5.3129);
        Currency currency = Currency.GBP;
        OperationType operationType = OperationType.SEL;
        //when
        double result = objectUnderTest.calculateValue(currency, operationType, 1000);
        //then
        Assertions.assertEquals(5312.9, result);
    }

    @Test
    void shouldReturnGbpBuyingValue() {
        //given
        Mockito.when(exchangeRates.getExchangeRates(Currency.GBP, OperationType.BUY)).thenReturn(5.2729);
        Currency currency = Currency.GBP;
        OperationType operationType = OperationType.BUY;
        //when
        double result = objectUnderTest.calculateValue(currency, operationType, 1000);
        //then
        Assertions.assertEquals(5272.9, result);
    }

    @Test
    void shouldReturnUsdSellingValue() {
        //given
        Mockito.when(exchangeRates.getExchangeRates(Currency.USD, OperationType.SEL)).thenReturn(4.3950);
        Currency currency = Currency.USD;
        OperationType operationType = OperationType.SEL;
        //when
        double result = objectUnderTest.calculateValue(currency, operationType, 1000);
        //then
        Assertions.assertEquals(4395, result);
    }

    @Test
    void shouldReturnUsdBuyingValue() {
        //given
        Mockito.when(exchangeRates.getExchangeRates(Currency.USD, OperationType.BUY)).thenReturn(4.3650);
        Currency currency = Currency.USD;
        OperationType operationType = OperationType.BUY;
        //when
        double result = objectUnderTest.calculateValue(currency, operationType, 1000);
        //then
        Assertions.assertEquals(4365, result);
    }

    @Test
    void shouldReturnEurSellingValue() {
        //given
        Mockito.when(exchangeRates.getExchangeRates(Currency.EUR, OperationType.SEL)).thenReturn(4.7017);
        Currency currency = Currency.EUR;
        OperationType operationType = OperationType.SEL;
        //when
        double result = objectUnderTest.calculateValue(currency, operationType, 1000);
        //then
        Assertions.assertEquals(4701.7, result);
    }

    @Test
    void shouldReturnEurBuyingValue() {
        //given
        Mockito.when(exchangeRates.getExchangeRates(Currency.EUR, OperationType.BUY)).thenReturn(4.6715);
        Currency currency = Currency.EUR;
        OperationType operationType = OperationType.BUY;
        //when
        double result = objectUnderTest.calculateValue(currency, operationType, 1000);
        //then
        Assertions.assertEquals(4671.5, result);
    }



}
