package apps;

import enums.Currency;
import enums.OperationType;
import interfaces.ExchangeRates;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

class CurrencyCalculatorTest {

    class CurrencyCalculator {

        private ExchangeRates exchangeRates;

        private CurrencyCalculator objectUnderTest;
        @BeforeEach
        public void beforeEachTest(){
            exchangeRates = Mockito.mock(ExchangeRates.class);
            objectUnderTest = new CurrencyCalculator(exchangeRates);

        }


        @Test
        void shouldReturnTrueWhenGetALoan() {

            //given
            Mockito.when(exchangeRates.getExchangeRates(Currency.GBP, OperationType.SEL)).thenReturn(4.66);

            //when



            //then

        }

    }
}