import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Timer;
import java.util.TimerTask;


public class Main {

    public static String plurlaize(String word, int number) {
        if (number == 0 || number > 1) {
            String pluralizedString = "I own " + number + " " + word + "s.";
            System.out.println(pluralizedString);
            return pluralizedString;
        } else {
            String pluralizedString = "I own " + number + " " + word + ".";
            System.out.println(pluralizedString);
            return pluralizedString;
        }
    }

    public static void flipNHeads(int flipsInARow) {
        int instanceCounter = 0;
        int headsCounter = 0;
        for (int i = 0; headsCounter < flipsInARow; i++) {
            double randomNum = Math.random();
            if (randomNum > 0.5) {
                System.out.println("heads");
                headsCounter++;
                instanceCounter++;
            } else {
                System.out.println("tails");
                headsCounter = 0;
                instanceCounter++;
            }
        }
        if(flipsInARow > 1) System.out.println("it took " + instanceCounter + " flips to flip " + flipsInARow + " heads in a row.");
        else System.out.println("it took " + instanceCounter + " flips to flip " + flipsInARow + " head in a row.");
    }

    public static class printOneSec extends TimerTask {
        public void run() {
            LocalDateTime everySecond = LocalDateTime.now();
            DateTimeFormatter formattedTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
            System.out.println(formattedTime.format(everySecond));

        }
    }
    //https://stackoverflow.com/questions/12908412/print-hello-world-every-x-seconds



    public static void main(String[] args) {
        plurlaize("dog", 3);
        plurlaize("cat", 1);
        plurlaize("car", 4);
        flipNHeads(2);
        Timer timer2 = new Timer();
        timer2.schedule(new printOneSec(), 0, 1000);

    }
}
