import org.junit.Test;

import static org.junit.Assert.*;

public class PunctuationNodeTest {

  @Test
  public void testPunctuationNodeGetNumberOfWords() {
    Sentence punctuationNode = new PunctuationNode(",", new WordNode("world", new EmptyNode()));

    assertEquals(1, punctuationNode.getNumberOfWords());
  }

  @Test
  public void testPunctuationNodeLongestWord() {
    Sentence punctuationNode = new PunctuationNode(",", new WordNode("world", new EmptyNode()));

    assertEquals("world", punctuationNode.longestWord());
  }

  @Test
  public void testPunctuationNodeToString() {
    Sentence punctuationNode = new PunctuationNode(",", new WordNode("world", new EmptyNode()));

    assertEquals(",world .", punctuationNode.toString());
  }
}