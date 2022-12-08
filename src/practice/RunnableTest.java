package practice;

public class RunnableTest {
	public static void main(String[] args) {
		RunnableExample r = new RunnableExample();
		Thread thread = new Thread(r);
		
		thread.start();
		
		int num = 1;
		int sum = 1;
		
		while(num <= 10) {
			sum = num + sum;
			System.out.println("sum : " + sum);
			num++;
		}
	}
}

class RunnableExample implements Runnable {
	@Override
	public void run() {
		int num = 1;
		int multiple = 1;
		
		while(num <= 10) {
			multiple = num * multiple;
			System.out.println("multiple : " + multiple);
			num++;
		}
	}
}
