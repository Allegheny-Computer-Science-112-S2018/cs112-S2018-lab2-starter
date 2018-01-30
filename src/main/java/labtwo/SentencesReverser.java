package labtwo;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * This takes all of the steps to read in and reverse a list of sentences.
 *
 * <p>Bugs: This class has no known bugs.
 *
 * @author Gregory M. Kapfhammer
 */

public class SentencesReverser {

  /**
   * The starting point for executing the SentencesReverser.
   *
   * @param args The command line arguments
   *
   * @author Gregory M. Kapfhammer
   */
  public static void main(String[] args) throws IOException {
    // STEP 1: Constructs the sentences object and read them from file
    Sentences sentences = new Sentences();
    sentences.readSentencesFromFile();

    // STEP 2: Display the sentences in their original order
    sentences.printSentences();

    // STEP 3: Reverse the sentences
    sentences.reverseSentences();

    // STEP 4: Display the sentences in the reversed order
    sentences.printSentences();
  }

}
