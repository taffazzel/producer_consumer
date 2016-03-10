
public class Consumer implements Runnable{

	Box box;
	public Consumer(Box box)
	{
		this.box=box;
	}
	
	public void run(){
		String message=null;
		boolean flag=true;
		while(flag!=false)
		{
			message = box.take();
			if(message.equals("done"))
			{
				System.out.println(message);
				flag=false;
			}
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


