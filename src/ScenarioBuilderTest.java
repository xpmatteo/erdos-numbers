import static org.junit.Assert.*;

import org.junit.*;

public class ScenarioBuilderTest {

	@Test
	public void onePaperOneAuthor() throws Exception {
		Object problem = new ScenarioBuilder().withPaper("paper").withAuthor("author").build();
		assertEquals(lines("1", "1 1", "paper", "author"),  problem);
	}

	@Test
	public void threePapersTwoAuthors() throws Exception {
		Object problem = new ScenarioBuilder()
				.withPaper("paper0")
				.withPaper("paper1")
				.withPaper("paper2")
				.withAuthor("author0")
				.withAuthor("author1")
				.build();
		assertEquals(lines("1", "3 2", "paper0","paper1","paper2", "author0","author1"),  problem);
	}


	private String lines(String ...strings) {
		return String.join("\n", strings) + "\n";
	}

}
