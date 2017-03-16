import static java.util.Arrays.*;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.*;

public class PaperTest {

	@Test
	public void newPaper() throws Exception {
		Paper paper = new Paper("Foo, X., Smith, W.H.: Doing stuff");

		assertThat(paper.authors().get(0).name(), equalTo("Foo, X."));
		assertThat(paper.authors().get(1).name(), equalTo("Smith, W.H."));
		assertThat(paper.authors(), equalTo(asList(new Author("Foo, X."), new Author("Smith, W.H."))));
	}

}
