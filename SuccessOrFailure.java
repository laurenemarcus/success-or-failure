import java.io.Console;

public class SuccessOrFailure {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("What grade did you get in math 101? ('A', 'B', 'C', 'D', 'F')");
    String grade = myConsole.readLine();

    if ( grade.equals("A") || grade.equals("B") || grade.equals("C") ) {
      System.out.println("You put in a sufficient amount of effort. Nice work.");
    } else if ( grade.equals("D") || grade.equals("F") ) {
      System.out.println("Work harder next time.");
    } else {
      System.out.println("Invalid entry.");
    }
  }
}
