/**
 * Represents WordNode in a sentence.
 */
public class WordNode implements Sentence {
  private String word;
  private Sentence next;

  /**
   * Constructs WordNode with given word and next node.
   *
   * @param word for this node
   * @param next for next node
   */
  public WordNode(String word, Sentence next) {
    this.word = word;
    this.next = next;
  }

  @Override
  public int getNumberOfWords() {
    return 1 + next.getNumberOfWords();
  }

  @Override
  public String longestWord() {
    String longestWord = next.longestWord();
    if (word.length() >= longestWord.length()) {
      return word;
    } else {
      return longestWord;
    }
  }

  public String toString() {
    return word + " " + next.toString();
  }

  @Override
  public Sentence clone() {
    return new WordNode(word, next.clone());
  }

  @Override
  public Sentence merge(Sentence other) {
    return new WordNode(word, next.merge(other));
  }
}
