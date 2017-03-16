import static java.util.Arrays.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.*;

import org.hamcrest.*;
import org.junit.*;

public class AuthorTest {

	@Test
	public void newAuthor() throws Exception {
		Author author = new Author("Foo, B.");
		assertThat(author.erdosNumber(), is(equalTo(Integer.MAX_VALUE)));
		assertTrue("new author erdos number is infinite", author.hasInfiniteErdosNumber());
	}

	@Test
	public void erdosNumberNeverIncreases() {
		Author author = new Author("Jiraya, S.");

		author.reduceErdosTo(3);
		author.reduceErdosTo(6);

		assertThat(author.erdosNumber(), is(equalTo(3)));
	}


	@Test@Ignore
	public void propagateErdosNumberToNeighbors() {
		Author ninja = new Author("Ninja, E");
		Author author = new Author("Jiraya, S.", asList(ninja));

		author.reduceErdosTo(6);

		assertThat(author.erdosNumber(), is(equalTo(6)));
		assertThat(ninja.erdosNumber(), is(equalTo(7)));
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
