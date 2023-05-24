import org.junit.Test;

import static org.junit.Assert.*;

public class EmptyNodeTest {

  @Test
  public void testEmptyNodeGetNumberOfWords() {
    Sentence emptyNode = new EmptyNode();

    assertEquals(0, emptyNode.getNumberOfWords());
  }

  @Test
  public void testEmptyNodeLongestWord() {
    Sentence emptyNode = new EmptyNode();

    assertEquals("", emptyNode.longestWord());
  }

  @Test
  public void testEmptyNodeToString() {
    Sentence emptyNode = new EmptyNode();

    assertEquals(".", emptyNode.toString());
  }
}