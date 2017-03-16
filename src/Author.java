
public class Author {

	private String name;

	public Author(String name) {
		this.name = name;
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
}
