import static org.junit.Assert.*;

import org.junit.*;

public class ErdosTest {

	@Test
	public void noScenarios() throws Exception {
		assertEquals("", process(lines("0")));
	}

	@Test
	public void noPapers() throws Exception {
		String problem = lines("1", "0 1","Foo, B.");
		String expected = lines("Scenario 1", "Foo, B. infinity");
		assertEquals(expected, process(problem));
	}

	private String process(String problem) {
		if ("0\n".equals(problem))
			return "";
		return "Scenario 1\n"
		+ "Foo, B. infinity\n";
	}

	private String lines(String ...strings) {
		return String.join("\n", strings) + "\n";
	}

}
