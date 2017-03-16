import java.util.*;

public class Author {

	private static final String ERDOS_HIMSELF = "Erdos, P.";
	private String name;
	private int erdosNumber;

	public Author(String name) {
		this(name, Collections.emptyList());
	}

	public Author(String name, List<Author> asList) {
		this.name = name;
		this.erdosNumber = (ERDOS_HIMSELF.equals(name)) ? 0 : Integer.MAX_VALUE;
	}

	@Override
	public String toString() {
		return "Author: " + name;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Author))
			return false;
		Author other = (Author) obj;
		return this.name.equals(other.name);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	public String name() {
		return name;
	}

	public int erdosNumber() {
		return erdosNumber;
	}

	public boolean hasInfiniteErdosNumber() {
		return Integer.MAX_VALUE == this.erdosNumber;
	}

	public void reduceErdosTo(int newErdosNumber) {
		this.erdosNumber = newErdosNumber > this.erdosNumber ? this.erdosNumber : newErdosNumber;
	}
}
