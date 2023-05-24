/**
 * Represent EmptyNode in a sentence.
 */
public class EmptyNode implements Sentence {

  /**
   * Constructs an EmptyNode.
   */
  public EmptyNode() {

  }
  @Override
  public int getNumberOfWords() {
    return 0;
  }

  @Override
  public String longestWord() {
    return "";
  }

  @Override
  public String toString() {
    return ".";
  }

  @Override
  public Sentence clone() {
    return new EmptyNode();
  }

  @Override
  public Sentence merge(Sentence other) {
    return other.clone();
  }
}
