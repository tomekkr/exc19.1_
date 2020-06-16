import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersTest {
    private Numbers systemUnderTest;

    @BeforeEach
    void setUp() {
        systemUnderTest = new Numbers();
    }

    @Test
    void shouldReturn23ForNumberValueLimitedTo10() {
        //given
        int numberValueLimit = 10;

        //when
        int result = systemUnderTest.sumMultiplesOfNumbersThreeOrFive(numberValueLimit);

        //then
        int expectedResult = 23;
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturn33ForNumberValueLimitedTo11() {
        //given
        int numberValueLimit = 11;

        //when
        int result = systemUnderTest.sumMultiplesOfNumbersThreeOrFive(numberValueLimit);

        //then
        int expectedResult = 33;
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturn33ForNumberValueLimitedTo12() {
        //given
        int numberValueLimit = 12;

        //when
        int result = systemUnderTest.sumMultiplesOfNumbersThreeOrFive(numberValueLimit);

        //then
        int expectedResult = 33;
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturn45ForNumberValueLimitedTo13() {
        //given
        int numberValueLimit = 13;

        //when
        int result = systemUnderTest.sumMultiplesOfNumbersThreeOrFive(numberValueLimit);

        //then
        int expectedResult = 45;
        assertEquals(expectedResult, result);
    }

    @Test
    void shouldReturn60ForNumberValueLimitedTo16() {
        //given
        int numberValueLimit = 16;

        //when
        int result = systemUnderTest.sumMultiplesOfNumbersThreeOrFive(numberValueLimit);

        //then
        int expectedResult = 60;
        assertEquals(expectedResult, result);
    }
}