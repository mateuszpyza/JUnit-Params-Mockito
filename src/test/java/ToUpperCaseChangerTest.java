import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ToUpperCaseChangerTest {
    @ParameterizedTest
    @ValueSource(strings = {"Mateusz", "dfsasfa", "sdafsadf", "dsfsgd"})
    void shouldUpperCaseText(String input) {
        String expected = input.toUpperCase();

        Assertions.assertEquals(expected, ToUpperCaseChanger.changeToUpperCase(input));

    }

    @ParameterizedTest
    @NullSource
    void shouldVerifyNullChangeToUpperCase(String input) {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            ToUpperCaseChanger.changeToUpperCase(input);
        });

        String expectedMessage = "Input data problems.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @ParameterizedTest
    @EmptySource
    void shouldVerifyEmptyStringChangeToUpperCase(String input) {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            ToUpperCaseChanger.changeToUpperCase(input);
        });

        String expectedMessage = "Input data problems.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}