import static java.util.Arrays.*;
import static org.junit.Assert.*;

import org.junit.*;

public class ProblemTest {

	@Test
	public void parsingProblem() throws Exception {
		String problemText = new ScenarioBuilder()
				.withPaper("Heisig, W., Zooz, X.Y.: Some impressive work")
				.withAuthor("Heisig, W.")
				.withAuthor("Zooz, X.Y.")
				.build();

		Problem problem = new Problem(problemText);

		assertEquals(1, problem.numberOfScenarios());
		assertEquals(1, problem.numberOfPapers());
		assertEquals(2, problem.numberOfAuthors());
		assertEquals(asList(new Paper("Heisig, W., Zooz, X.Y.: Some impressive work")), problem.papers());
		assertEquals(asList(new Author("Heisig, W."), new Author("Zooz, X.Y.")), problem.authors());
	}


}
