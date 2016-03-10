
public class Box {
	
	String message;
	boolean empty;
	
	
	public Box(){
		empty=true;
	}
	
	public synchronized String take(){
		while(empty){
			try{
				wait();
			}
			catch(InterruptedException ie)
			{
				
			}
			
			
		}
		notifyAll();
		empty=true;
		return message;
	}
	
	public synchronized void put(String message)
	{
		while(!empty){
			try{
					wait();
					
			}
			catch(InterruptedException ie)
			{
				
			}
			empty=false;
			this.message=message;
			notifyAll();
			
		}
	}
}
