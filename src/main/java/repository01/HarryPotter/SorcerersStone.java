package repository01.HarryPotter;

public class SorcerersStone extends Rock implements Answerer {

  @Override
  public void askQuestion(String question) {
    System.out.println("Ich kenne die Antwort nicht! " + question);
  }
}
