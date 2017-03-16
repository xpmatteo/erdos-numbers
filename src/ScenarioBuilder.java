import java.util.*;

public class ScenarioBuilder {

	List<String> papers = new ArrayList<>();
	List<String> authors = new ArrayList<>();

	public ScenarioBuilder withPaper(String paper) {
		papers.add(paper);
		return this;
	}

	public ScenarioBuilder withAuthor(String author) {
		authors.add(author);
		return this;
	}

	public String build() {

		return "1\n" + counts() + papers() + authors();
	}

	private String authors() {
		return String.join("\n", authors) + "\n";
	}

	private String papers() {
		return String.join("\n", papers) + "\n";
	}

	private String counts() {
		return String.format("%d %d\n", papers.size(), authors.size());
	}

}
