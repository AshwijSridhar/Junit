package junitTestCase;

import static org.junit.Assert.*;

import org.emids.service.Payment;
import org.junit.Test;

public class PaymentTest {

	@Test(expected = RuntimeException.class)
    public final void whenMoreThan1NumbersAreUsedThenExceptionIsThrown() {
        Payment.makePayment()
}
	}

}
