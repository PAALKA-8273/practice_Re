package ExampleOfCollections;

public class ExampleMutiThreading extends Thread {
	
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
		super.run();
	}

	public static void main(String[] args) {
		ExampleMutiThreading emt=new ExampleMutiThreading();
		emt.start();
		System.out.println("MainMethod");
		System.out.println("MainMethod");
		System.out.println("MainMethod");
		System.out.println("MainMethod");
		System.out.println("MainMethod");
	}

}
