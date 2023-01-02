import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;

import java.awt.image.SampleModel;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TextLengthTest {
    @ParameterizedTest
    @MethodSource("provideStringsForCalculateLength")
    void shouldVerifyStringTrimAndInLowerCase(String input, int expected) {
        int actualValue = TextLength.getTextLength(input);
        Assertions.assertEquals(expected, actualValue);
    }

    private static Stream<Arguments> provideStringsForCalculateLength() {
        return Stream.of(
                Arguments.of("kebab", 5),
                Arguments.of("ul", 2),
                Arguments.of("FutureCorals", 12)
        );
    }

    @ParameterizedTest
    @NullSource
    void shouldVerifyNullStringTextLength(String input) {
        NullPointerException exception = Assertions.assertThrows(NullPointerException.class, () -> {
            TextLength.getTextLength(null);
        });

        Assertions.assertEquals("Input data problems!", exception.getMessage());
    }

}