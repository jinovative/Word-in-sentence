import org.junit.Test;

import static org.junit.Assert.*;

public class WordNodeTest {

  @Test
  public void testWordNodeGetNumberOfWords() {
    Sentence wordNode = new WordNode("Hello", new EmptyNode());

    assertEquals(1, wordNode.getNumberOfWords());
  }

  @Test
  public void testWordNodeLongestWord() {
    Sentence wordNode = new WordNode("Hello", new EmptyNode());

    assertEquals("Hello", wordNode.longestWord());
  }

  @Test
  public void testWordNodeToString() {
    Sentence wordNode = new WordNode("Hello", new EmptyNode());

    assertEquals("Hello .", wordNode.toString());
  }
}