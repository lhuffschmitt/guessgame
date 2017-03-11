/**
 * Created by laurent on 3/11/17.
 */
public class player {
    int number = 0;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println ("I'm guessing " + number);

    }
}
