package apps;

import interfaces.BaseSalary;
import interfaces.WorkingSaturday;
import models.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import java.util.stream.Stream;


class SalaryCalculatorTest {

    private BaseSalary baseSalary;
    private WorkingSaturday workingSaturday;
    private SalaryCalculator objectUnderTest;

    @BeforeEach
    void beforeEach() {
        baseSalary = Mockito.mock(BaseSalary.class);
        workingSaturday = Mockito.mock(WorkingSaturday.class);
        objectUnderTest = new SalaryCalculator(baseSalary, workingSaturday);
    }


    @ParameterizedTest
    @MethodSource("provideValues")
    void shouldCalculateTotalSalary(Employee employee,double valueOfBaseSalary,double valueOfWorkingSaturdayBonus,double expectedSalary) {
        //given
        Mockito.when(baseSalary.getBaseSalary(employee)).thenReturn(valueOfBaseSalary);
        Mockito.when(workingSaturday.getValueOfWorkingSaturdayBonus(employee)).thenReturn(valueOfWorkingSaturdayBonus);
        //when
        double result = objectUnderTest.calculateSalary(employee);
        //then
        Assertions.assertEquals(expectedSalary, result);
    }

    private static Stream<Arguments> provideValues() {
        Employee Jan = new Employee("Jan","Kowalski",2,1000);
        Employee Helenka = new Employee("Helena","Smith",0,5000);


        return Stream.of(
                Arguments.of(Jan,2000,100,3200),
                Arguments.of(Helenka,6000,720,11000)
        );
    }



}