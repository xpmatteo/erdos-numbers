import static org.junit.Assert.*;

import org.junit.*;

public class ErdosTest {

	@Test
	public void noScenarios() throws Exception {
		assertEquals("", process("0\n"));
	}

	@Test
	public void noPapers() throws Exception {
		assertEquals("", process("1\n"));
	}

	private String process(String problem) {
		return "";
	}

}
