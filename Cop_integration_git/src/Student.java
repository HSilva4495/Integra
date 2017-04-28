
public class Student {
  
  private String name;
  private double[] scores; // an array as the field of a class

  public Student(String n) { // constructor method, called automatic when new objects are created
    name = n;
    // actually create the space in memory for the array
    scores = new double[3];

  }

  public void setScore(int testNum, int score) {
    if (testNum >= 1 && testNum <= 3) {
      scores[testNum - 1] = score;
    }
  }

  public String getName() {
    return name;
  }

  public double[] getScores() {
    return scores;
  }
}