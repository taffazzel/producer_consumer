
public class MainProducerConsumer {
	
	public static void main(String [] a)
	{
		System.out.println("Before object");
		Box bx=new Box();
		
		
		Thread Prod1=(new Thread(new Producer(bx)));
		Thread Prod2=(new Thread(new Producer(bx)));
		Thread Con1=(new Thread(new Consumer(bx)));
		Thread Con2=(new Thread(new Consumer(bx)));
		
		Prod1.start();
		System.out.println("after Prod1");
		Prod2.start();
		Con1.start();
		Con2.start();
	}

}
