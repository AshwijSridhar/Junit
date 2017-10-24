package junitTestCase;


import java.io.InputStream ;


import org.emids.service.Payment;
import org.junit.Assert;
import org.junit.Test;

public class onlinebookcartAppTest {

	@Test
	public void makePaymentTest(Object makePaymnet) {
		
		Assert.assertEquals(1|2,Payment.makePayment());
		
				
		}
	}


