import org.junit.Test;

import static org.junit.Assert.*;

public class SentenceTest {

  @Test
  public void testGetNumberOfWords() {
    Sentence sentence = new WordNode("Hello", new WordNode("World", new WordNode("NEU", new PunctuationNode(",", new WordNode("5004", new EmptyNode())))));

    assertEquals(4, sentence.getNumberOfWords());
  }

  @Test
  public void testLongestWord() {
    Sentence sentence = new WordNode("Hello", new WordNode("World", new WordNode("NEU", new PunctuationNode(",", new WordNode("5004", new EmptyNode())))));

    assertEquals("Hello", sentence.longestWord());
  }

  @Test
  public void testToString() {
    Sentence sentence = new WordNode("Hello", new WordNode("World", new WordNode("NEU", new PunctuationNode(",", new WordNode("5004", new EmptyNode())))));

    assertEquals("Hello World NEU ,5004 .", sentence.toString());
  }

  @Test
  public void testClone() {
    Sentence sentence = new WordNode("Hello", new WordNode("World", new WordNode("NEU", new PunctuationNode(",", new WordNode("5004", new EmptyNode())))));
    Sentence clonedSentence = sentence.clone();

    assertEquals(sentence.toString(), clonedSentence.toString());
    assertNotSame(sentence, clonedSentence);
  }

  @Test
  public void testMerge() {
    Sentence sentence1 = new WordNode("This", new WordNode("is", new EmptyNode()));
    Sentence sentence2 = new WordNode("a", new PunctuationNode(".", new WordNode("sentence", new EmptyNode())));
    Sentence mergedSentence = sentence1.merge(sentence2);

    assertEquals("This is a .sentence .", mergedSentence.toString());
    assertNotSame(sentence1, mergedSentence);
    assertNotSame(sentence2, mergedSentence);
  }
}