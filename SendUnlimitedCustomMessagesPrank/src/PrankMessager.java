import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class PrankMessager
{
        public static void main(String[] args) throws InterruptedException, AWTException
        {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the message you want to send : ");
            String msg = scanner.nextLine();
            System.out.println("How many time you want to send the message : ");
            int size = scanner.nextInt();

            StringSelection stringSelection = new StringSelection(msg);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);

            Thread.sleep(3000);

            Robot robot = new Robot();
            for (int i = 1; i <= size; i++) {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);

                Thread.sleep(1000);

                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_V);

                Thread.sleep(1000);

                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);

                Thread.sleep(1000);
                //System.out.println("Hello world");

            }

            System.out.println("Task Completed...");
        }
}
