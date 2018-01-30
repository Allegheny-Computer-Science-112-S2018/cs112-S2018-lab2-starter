package labtwo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * This class represents a collection of sentences.
 *
 * <p>Bugs: This class has no known bugs but it is missing features.
 *
 * @author Gregory M. Kapfhammer
 */

public class Sentences {

  /** The array of sentences. */
  private Sentence[] sentences;

  /** The index of the current sentence in the array. */
  private int currentSentence;

  /** The starting index for the currentSentence. */
  private static final int STARTING_CURRENT_SENTENCE = 0;

  /** The file that contains the sentences. */
  private static final String SENTENCESFILE = "input/sentences.txt";

  /** The total number of sentences supported by the array. */
  private static final int NUMBER_OF_SENTENCES = 10;

  /** Constructs a new instance of the Sentences, creating default array. */
  public Sentences() {
    sentences = new Sentence[NUMBER_OF_SENTENCES];
    currentSentence = STARTING_CURRENT_SENTENCE;
  }

  /** Constructs a new instance of the Sentences, creating sized array. */
  public Sentences(int size) {
  }

  public void addSentence(Sentence sentence) {
    sentences[currentSentence] = sentence;
    currentSentence = (currentSentence + 1) % NUMBER_OF_SENTENCES;
  }

  public Sentence[] getSentences() {
    return sentences;
  }

  /** Reads the sentences from the file and adds them to the array. */
  public void readSentencesFromFile() throws IOException {
  }

  /** Displays all of the sentences to the screen. */
  public void printSentences() {
  }

  /** Reverses the sentences in the sentences[] array. */
  public void reverseSentences() {
  }

}
