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

}
