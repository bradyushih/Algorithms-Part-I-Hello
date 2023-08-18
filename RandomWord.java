import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = "";
        int count = 1;
        while (!StdIn.isEmpty()) {
            String readWord = StdIn.readString();
            if (count == 1) {
                champion = readWord;
                count++;
                continue;
            }
            String competitor = readWord;
            boolean win = StdRandom.bernoulli(1.0 / count);
            if (win) {
                champion = competitor;
            }
            count++;
        }
        StdOut.println(champion);
    }
}
