package introduction1.printer;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created with IntelliJ IDEA.
 * User: takasianpride
 * Date: 2013/08/05
 * Time: 17:18
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        ThreadFactory factory = Executors.defaultThreadFactory();
        factory.newThread(new Printer("hogehoge")).start();
        factory.newThread(new Printer("FUGA")).start();
    }
}
