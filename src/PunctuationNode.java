/**
 * Represents PunctuationNode in a sentence.
 */
public class PunctuationNode implements Sentence {
  private String punctuation;
  private Sentence next;

  /**
   * Constructs a PunctuationNode with given punctuation and next node.
   *
   * @param punctuation mark for this node
   * @param next for next node
   */
  public PunctuationNode(String punctuation, Sentence next) {
    this.punctuation = punctuation;
    this.next = next;
  }

  @Override
  public int getNumberOfWords() {
    return next.getNumberOfWords();
  }

  @Override
  public String longestWord() {
    return next.longestWord();
  }

  public String toString() {
    return punctuation + next.toString();
  }

  @Override
  public Sentence clone() {
    return new PunctuationNode(punctuation, next.clone());
  }

  @Override
  public Sentence merge(Sentence other) {
    return new PunctuationNode(punctuation, next.merge(other));
  }
}
