package introduction1.printer;

/**
 * Created with IntelliJ IDEA.
 * User: takasianpride
 * Date: 2013/08/05
 * Time: 17:18
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        new Thread(new Printer("hogehoge")).start();
        new Thread(new Printer("fugafuga")).start();
    }
}
