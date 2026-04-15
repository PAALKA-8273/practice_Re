package ExampleOfCollections;

public class ExampleOfRunnable implements Runnable{
	

	
	public static void main(String[] args) {
		ExampleOfRunnable eor=new ExampleOfRunnable();
		Thread t=new Thread(eor);
		t.start();
		System.out.println("MM1");
		System.out.println("MM2");
		System.out.println("MM2");
		System.out.println("MM2");
		System.out.println("MM2");
		System.out.println("MM2");
		System.out.println("MM2");
		System.out.println("MM2");
		System.out.println("MM2");
		System.out.println("MM2");
		System.out.println("MM2");

	}
	@Override
	public void run() {
		System.out.println("RUN1");
		System.out.println("RUN2");
		System.out.println("RUN3");
		System.out.println("RUN4");
		System.out.println("RUN5");	

		System.out.println("RUN6");
		System.out.println("RUN7");
		System.out.println("RUN8");
		System.out.println("RUN9");
		System.out.println("RUN10");
	}

}
