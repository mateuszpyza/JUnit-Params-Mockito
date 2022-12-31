import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;



class OperationsOnNumbersTest {
    @ParameterizedTest
    @ValueSource(ints = {2,4,6,8,10,324})
    void shouldReturnTrue(int number){
        Assertions.assertTrue(OperationsOnNumbers.isDivisibleByTwo(number));
    }
    @ParameterizedTest
    @ValueSource(ints = {1,3,5,7,37589})
    void shouldReturnFalse(int number){
        Assertions.assertFalse(OperationsOnNumbers.isDivisibleByTwo(number));
    }
    @ParameterizedTest
    @CsvSource(value = {"666:18","100045:10","1234567890:45"},delimiter = ':')
    void shouldReturnDigitsSum(int input,int expected){
        Assertions.assertEquals(expected,OperationsOnNumbers.addDigitsInNumber(input));
    }

}