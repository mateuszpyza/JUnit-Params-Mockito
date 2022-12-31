import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class SeasonPrinterTest {

    @ParameterizedTest
    @EnumSource(value = Month.class,names = {"Winter","Summer","Spring","Autumn"})
    void shouldReturnEnum(Month value,String names ) {
        Assertions.assertTrue(true);
    }
}