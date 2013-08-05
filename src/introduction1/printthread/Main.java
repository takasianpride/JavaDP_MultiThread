package introduction1.printthread;

public class Main {
	public static void main(String[] args) {
		new PrintThread("Hoge!").start();
		new PrintThread("Fuga!").start();
	}
}
