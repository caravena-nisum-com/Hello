import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;


public class HelloWorldAppTest  {

	@Test
	public void testMain() throws IOException {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		
		PrintStream printStream = new PrintStream(outputStream);
		
		System.setOut(printStream);
		
		HelloWorldApp.main(null);
		
		assertEquals("Hello World!!!\n", outputStream.toString());
	}
}
