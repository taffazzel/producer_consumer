
public class Producer implements Runnable {
	
		Box box;
		public Producer(Box box)
		{
			this.box=box;
		}
		
		public void run()
		{
			System.out.println("Run starting for Producer");
			String[] strarray={"The","Lazy","Fox","Jumps","Over","Brown","Dog"};
			//int arleng=strarray.length;
			//for(int i=0;i<=arleng;i++)
			for(String str: strarray)
			{
				box.put(str);
				try
				{
					Thread.sleep(1000);
					System.out.println("After sleep");
				}
				catch(InterruptedException ie)
				{
					ie.printStackTrace();
				}
			}
			
			box.put("done");
		}
}
