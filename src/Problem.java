import java.io.*;
import java.util.*;

public class Problem {

	private int numberOfScenarios;
	private int numberOfPapers;
	private int numberOfAuthors;
	private List<String> papers = new ArrayList<>();
	private List<String> authors = new ArrayList<>();

	public Problem(String problemText) {
		try (Scanner scanner = new Scanner(new StringReader(problemText))) {
			numberOfScenarios = scanner.nextInt();
			numberOfPapers = scanner.nextInt();
			numberOfAuthors = scanner.nextInt();
			scanner.nextLine();
			for (int paper = 0; paper < numberOfPapers; paper++) {
				papers.add(scanner.nextLine());
			}
			for (int i = 0; i < numberOfAuthors; i++) {
				authors.add(scanner.nextLine());
			}
		}
	}

	public int numberOfScenarios() {
		return numberOfScenarios;
	}

	public int numberOfPapers() {
		return numberOfPapers;
	}

	public int numberOfAuthors() {
		return numberOfAuthors;
	}

	public List<String> papers() {
		return papers;
	}

	public List<String> authors() {
		return authors;
	}

}
