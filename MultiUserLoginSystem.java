public class MultiUserLoginSystem {

    public static void main(String[] args) {

        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {

            LoginTask task = new LoginTask("User-" + (i + 1));
            threads[i] = new Thread();

            System.out.println("Thread " + (i + 1) + " State before start(): "
                    + threads[i].getState());

            threads[i].start();

            System.out.println("Thread " + (i + 1) + " State after start(): "
                    + threads[i].getState());
        }
    }
}
