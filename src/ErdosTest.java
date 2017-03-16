import static java.util.Arrays.*;
import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.*;

public class ErdosTest {

	@Test
	public void noScenarios() throws Exception {
		assertEquals("", solve(lines("0")));
	}

	@Test
	public void noPapers() throws Exception {
		String problem = lines("1", "0 1","Foo, B.");
		String expected = lines("Scenario 1", "Foo, B. infinity");
		assertEquals(expected, solve(problem));
	}

	@Test
	public void onePaper() throws Exception {
		String problem = aScenario()
				.withPaper("Heisig, W.: Some impressive work")
				.withAuthor("Heisig, W.")
				.withAuthor("Foo, B.")
				.build();
		String expected = lines("Scenario 1", "Heisig, W. infinity", "Foo, B. infinity");
		assertEquals(expected, solve(problem));
	}

	@Test
	public void erdosNumberOfErdos() throws Exception {
		String problem = aScenario()
				.withPaper("Erdos, P.: AAA")
				.withAuthor("Erdos, P.")
				.build();
		String expected = lines("Scenario 1", "Erdos, P. 0");
		assertEquals(expected, solve(problem));
	}

	private ScenarioBuilder aScenario() {
		return new ScenarioBuilder();
	}

	private String solve(String problemText) {
		if ("0\n".equals(problemText))
			return "";
		Problem problem = new Problem(problemText);
		String result = "Scenario 1\n";
		for (int i = 0; i < problem.authors().size(); i++) {
			Author author = problem.authors().get(i);
			String erdosNumber = author.hasInfiniteErdosNumber() ? "infinity" : String.valueOf(author.erdosNumber());
			result += author.name() + " " + erdosNumber + "\n";
		}
		return result;
	}

	private String lines(String ...strings) {
		return String.join("\n", strings) + "\n";
	}

}
