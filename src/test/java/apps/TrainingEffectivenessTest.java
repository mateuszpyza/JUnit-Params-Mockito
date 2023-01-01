package apps;

import interfaces.SmartWatch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import java.util.stream.Stream;


class TrainingEffectivenessTest {
    private SmartWatch smartWatch;
    private TrainingEffectiveness objectUnderTest;


    @BeforeEach
    public void BeforeEach() {
        smartWatch = Mockito.mock(SmartWatch.class);
        objectUnderTest = new TrainingEffectiveness(smartWatch);
    }


    @ParameterizedTest
    @MethodSource("provideStringsForCalculateLength")
    void shouldVerifyStringTrimAndInLowerCase(int trainingTimeInMinutes, int numberOfBurnedCalories, int averageHeartRate, String expected) {
        //given
        Mockito.when(smartWatch.getTrainingTimeInMinutes()).thenReturn(trainingTimeInMinutes);
        Mockito.when(smartWatch.getNumberOfBurnedCalories()).thenReturn(numberOfBurnedCalories);
        Mockito.when(smartWatch.getAverageHeartRate()).thenReturn(averageHeartRate);
        //when
        String result = objectUnderTest.getTrainingEvaluation();
        //then
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> provideStringsForCalculateLength() {
        return Stream.of(
                Arguments.of(25, 255, 180, "niska"),
                Arguments.of(40, 350, 180, "dobra"),
                Arguments.of(40, 350, 165, "bardzo dobra"),
                Arguments.of(75, 500, 155, "doskonała")
        );
    }

}