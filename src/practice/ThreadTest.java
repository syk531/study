package practice;

public class ThreadTest {
	public static void main(String[] args) {
		Thread t = new ThreadExample();
		t.start();
		
		int num = 1;
		int sum = 1;
		
		while(num <= 10) {
			sum = num + sum;
			System.out.println("sum : " + sum);
			num++;
		}
	}
}


class ThreadExample extends Thread {
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