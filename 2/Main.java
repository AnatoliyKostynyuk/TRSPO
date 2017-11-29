import java.util.Scanner;

class Main {

	public static void main(String[] args) {		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String line = scanner.nextLine();
			Thread t = new Thread(new Runnable() {

				@Override
				public void run() {
					System.out.println("My name is " + line);
					while(true) {
						try {
							Thread.sleep(6000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("My name is " + line);
					}
				}});
			
			t.start();
		}	
	}
}