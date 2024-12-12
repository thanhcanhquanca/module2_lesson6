package moveablepoint;

public class Main {
    public static void main(String[] args) {

            MovablePoint mp = new MovablePoint(2.0f, 3.0f, 1.0f, 1.5f);
            System.out.println("di chuyen: " + mp);

            mp.move();
            System.out.println("sau di chuyen: " + mp);

            mp.setSpeed(2.0f, 2.5f);
            mp.move();
            System.out.println(" mp: " + mp);

    }
}
