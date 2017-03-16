import java.util.*;

public class Paper {
	private String text;
	private List<Author> authors = new ArrayList<>();

	public Paper(String text) {
		this.text = text;
		String authorList = text.split(":")[0];
		String[] authorTokens = authorList.split(",");
		for (int i = 0; i < authorTokens.length; i += 2) {
			String name = authorTokens[i].trim() + "," + authorTokens[i+1];
			authors.add(new Author(name));
		}
	}

	@Override
	public String toString() {
		return "Paper: " + text;
	}

	@Override
	public int hashCode() {
		return text.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Paper))
			return false;
		Paper other = (Paper) obj;
		return this.text.equals(other.text);
	}

	public List<Author> authors() {
		return authors ;
	}



}
