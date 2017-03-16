import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

public class AuthorTest {

	@Test
	public void newAuthor() throws Exception {
		Author author = new Author("Foo, B.");
		assertThat(author.erdosNumber(), is(equalTo(Integer.MAX_VALUE)));
		assertTrue("new author erdos number is infinite", author.hasInfiniteErdosNumber());
	}

	@Test
	public void erdosNumberOfErdos() throws Exception {
		Author author = new Author("Erdos, P.");
		assertThat(author.erdosNumber(), is(equalTo(0)));
	}

	@Test
	public void reducingErdosNumber() throws Exception {
		Author author = new Author("Zork, H.");
		author.reduceErdosTo(3);
		assertThat(author.erdosNumber(), is(equalTo(3)));
		assertFalse("new author erdos number is infinite", author.hasInfiniteErdosNumber());
	}

}
