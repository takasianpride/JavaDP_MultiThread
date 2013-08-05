package introduction1.printer;

/**
 * Created with IntelliJ IDEA.
 * User: takasianpride
 * Date: 2013/08/05
 * Time: 17:09
 * To change this template use File | Settings | File Templates.
 */
public class Printer implements Runnable {
    private String message;

    public Printer(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.print(message);
        }
    }
}
