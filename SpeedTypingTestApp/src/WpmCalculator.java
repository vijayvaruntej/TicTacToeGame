import java.sql.SQLOutput;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class WpmCalculator
{
    public static void main(String[] args) throws InterruptedException {

        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("Goooo...!");

        String[] RandowWrods = {"adventure", "bicycle", "calendar", "diamond", "echo",
                "flourish", "giraffe", "harmony", "illusion", "jungle",
                "kite", "lighthouse", "mystery", "notebook", "obstacle",
                "puzzle", "quilt", "radiant", "sunflower", "telescope",
                "umbrella", "vivid", "whistle", "xenon", "yellow",
                "zenith", "acoustic", "brilliant", "cascade", "dreamer",
                "explorer", "fascinate", "glimmer", "horizon", "inspire"};

        Random random = new Random();
        for(int i=0; i<10; i++)
        {
            System.out.print(RandowWrods[random.nextInt(34)]+" ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        double timeBeforeTest = LocalTime.now().toNanoOfDay();
        String typedString = scanner.nextLine();
        double timeAfterTest = LocalTime.now().toNanoOfDay();

        int stringLength = typedString.length();
        // wpm = ((no.of chars/5)/1min)
        double timeDifference = ((timeAfterTest - timeBeforeTest)/1000000000.0);


        int wpm = (int) ((((double) stringLength/5)/timeDifference)*60);

        System.out.print("Your typing speed is ");
        for(int i=0; i<=2; i++)
        {
            Thread.sleep(1000);
            System.out.print(".");
        }

        System.out.print(" "+wpm + " WPM !");

    }
}
