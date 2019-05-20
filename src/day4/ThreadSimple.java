package day4;

public class ThreadSimple extends Thread {

	private String name;

	public ThreadSimple(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " run " + i);
		}
	}

}
