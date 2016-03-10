
public class Producer implements Runnable {
	
		Box box;
		public Producer(Box box)
		{
			this.box=box;
		}
		
		public void run()
		{
			String[] strarray={"The","Lazy","Fox","Jumps","Over","Brown","Dog"};
			int arleng=strarray.length;
			for(int i=0;i<=arleng;i++)
			{
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
			}
			
			box.put("done");
		}
}
