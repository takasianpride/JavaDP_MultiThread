package introduction1.Sleep;

/**
 * Created with IntelliJ IDEA.
 * User: takasianpride
 * Date: 2013/08/05
 * Time: 17:53
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Sleeep!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
