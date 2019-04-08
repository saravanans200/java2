package saran;

import static org.junit.Assert.*;

import org.junit.Test;

public class saranTest {
	 String message = "Hello World";	
	   saran saran = new saran(message);

	   @Test
	   public void testPrintMessage() {	  
	      assertEquals(message,saran.printMessage());
	   }
	}