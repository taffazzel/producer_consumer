
public class Consumer implements Runnable{

	Box box;
	public Consumer(Box box)
	{
		this.box=box;
	}
	
	public void run(){
		String message=null;
		boolean flag=true;
		System.out.println("run in Consumer");
		//while(flag!=false)
		//{
			//message = box.take();
			//if(message.equals("done"))
			while(!(message=box.take()).equals("done"))
			{
				System.out.println("In consumer while loop started");
				System.out.println(message);
				System.out.println("AFter printing in Consumer");
				//flag=false;
			
			try{
				
				Thread.sleep(2000);
			}
				
			catch(InterruptedException ie)
			{
				ie.printStackTrace();
			}
			break;
		}
			
	}
}


