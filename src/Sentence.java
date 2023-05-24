/**
 * Represents sentence linked list of nodes.
 */
public interface Sentence {

  /**
   * Computes and returns the number of words in a sentence.
   *
   * @return the number of words in a sentence
   */
  int getNumberOfWords();

  /**
   * Determines and returns the longest word in a sentence.
   *
   * @return the longest word in a sentence
   */
  String longestWord();

  /**
   * Convert the sentence into one string.
   * There must be a space between every two words.
   *
   * @return the string representation of the sentence
   */
  String toString();

  /**
   * Duplicate of a given sentence.
   *
   * @return Duplicate of a given sentence
   */
  Sentence clone();

  /**
   * Merge two sentences into a single sentence.
   *
   * @param other sentence to merge with
   * @return the merged sentence
   */
  Sentence merge(Sentence other);
}
