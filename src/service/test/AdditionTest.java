package service.test;



import org.junit.Assert;
import org.junit.Test;

import service.Addition;

public class AdditionTest {
	
    //Requirement 1: The method can take 0, 1 or 2 numbers separated by comma (,).
	@Test(expected = RuntimeException.class)
    public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
        Addition.add("1,2,3");
    }
    @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        Addition.add("1,2");
        Assert.assertTrue(true);
    }
    @Test(expected = RuntimeException.class)
    public final void whenNonNumberIsUsedThenExceptionIsThrown() {
        Addition.add("1,X");
    }
    
    //Requirement 2: For an empty string the method will return 0
    @Test
    public final void whenEmptyStringIsUsedThenReturnValueIs0() {
        Assert.assertEquals(0, Addition.add(""));
    }

    //Requirement 3: Method will return their sum of numbers
    @Test
    public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() {
        Assert.assertEquals(3, Addition.add("3"));
    }
     
    @Test
    public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() {
        Assert.assertEquals(3+6, Addition.add("3,6"));
    }
    
    //Requirement 4: Allow the Add method to handle an unknown amount of numbers
    
//  @Test(expected = RuntimeException.class)
//  public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
//      StringCalculator.add("1,2,3");
//  }
    @Test
    public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
        Assert.assertEquals(3+6+15+18+46+33, Addition.add("3,6,15,18,46,33"));
    }
    
    //Requirement 5: Allow the Add method to handle new lines between numbers
    @Test
    public final void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums() {
        Assert.assertEquals(3+6+15, Addition.add("3,6n15"));
    }
    
    //Requirement 6: Support different delimiters
    @Test
    public final void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
        Assert.assertEquals(3+6+15, Addition.add("//;n3;6;15"));
    }
}
