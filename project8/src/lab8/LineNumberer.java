package lab8;
import java.util.Scanner;

public class LineNumberer
{
  public static void main(String[] args)
  {
    /**
        THIS HAS NOT BEEN EDITED IN ANY WAY. SEE LineNumberer2.java FOR MODIFIED CODE FOR CHECKPOINT 1.
    */
    Scanner scanner = new Scanner(System.in);
    int lineCount = 1;

    while (scanner.hasNextLine())
    {
      String line = scanner.nextLine();
      System.out.print(lineCount + " ");
      System.out.println(line);
      lineCount += 1;
    }
    
    System.out.println("Done");
  }
}
