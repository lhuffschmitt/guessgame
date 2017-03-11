/**
 * Created by laurent on 3/11/17.
 */
public class guessgame {
    player p1;
    player p2;
    player p3;

    public void startgame () {
        p1 = new player();
        p2 = new player();
        p3 = new player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isright = false;
        boolean p2isright = false;
        boolean p3isright = false;

        int targetnumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9... ");

        while (true) {
            System.out.println("Number of guess is " + targetnumber);

            p1.guess ();
            p2.guess ();
            p3.guess ();

            guessp1 = p1.number;
            System.out.println ("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println ("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println ("Player three guessed " + guessp3);

            if (guessp1 == targetnumber) {
                p1isright = true;
            }
            if (guessp2 == targetnumber) {
                p2isright = true;
            }
            if (guessp3 == targetnumber) {
                p3isright = true;
            }

            if (p1isright || p2isright || p3isright) {
                System.out.println("We have a winner");
                System.out.println("WPlayer one got it right? " + p1isright);
                System.out.println("WPlayer two got it right? " + p2isright);
                System.out.println("WPlayer three got it right? " + p3isright);
                System.out.println ("Game is over.");
                break;
            } else {
                System.out.println ("Players will have to try again.");
            }

        }
    }

}
