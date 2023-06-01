import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Create examples of sentences and write tests for each operation.
 */

public class SentenceTest {

  @Test
  public void testGetNumberOfWords() {
    Sentence sentence = new WordNode("Hello", new WordNode("world,", new WordNode("I", new WordNode("am", new WordNode("student", new EmptyNode())))));
    Assert.assertEquals(5, sentence.getNumberOfWords());
  }

  @Test
  public void testLongestWord() {
    Sentence sentence = new WordNode("Hello", new WordNode("world,", new WordNode("I", new WordNode("am", new WordNode("student", new EmptyNode())))));
    Assert.assertEquals("student", sentence.longestWord());
  }

  @Test
  public void testToString() {
    Sentence sentence = new WordNode("Hello", new WordNode("world,", new WordNode("I", new WordNode("am", new WordNode("student", new EmptyNode())))));
    Assert.assertEquals("Hello world, I am student .", sentence.toString());
  }

  @Test
  public void testClone() {
    Sentence sentence = new WordNode("Hello", new WordNode("world,", new WordNode("I", new WordNode("am", new WordNode("student", new EmptyNode())))));
    Sentence clonedSentence = sentence.clone();
    Assert.assertEquals(sentence.toString(), clonedSentence.toString());
    Assert.assertNotSame(sentence, clonedSentence);
  }

  @Test
  public void testMerge() {
    Sentence sentence1 = new WordNode("Hello", new WordNode("world,", new EmptyNode()));
    Sentence sentence2 = new WordNode("I", new WordNode("am", new WordNode("student", new EmptyNode())));
    Sentence mergedSentence = sentence1.merge(sentence2);
    Assert.assertEquals("Hello world, I am student .", mergedSentence.toString());
    Assert.assertNotSame(sentence1, mergedSentence);
    Assert.assertNotSame(sentence2, mergedSentence);
  }
}