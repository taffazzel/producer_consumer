
public class MainProducerConsumer {
	
	public static void main(String [] a)
	{
		Box bx=new Box();
		
		//Thread p = (new Thread(new Producer(bx)));
		Thread Prod1=(new Thread(new Producer(bx)));
		Thread Prod2=(new Thread(new Producer(bx)));
		Thread Con1=(new Thread(new Consumer(bx)));
		Thread Con2=(new Thread(new Consumer(bx)));
		
		Prod1.start();
		Prod2.start();
		Con1.start();
		Con2.start();
	}

}
