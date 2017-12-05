public class ServantClient
{
	
	public static void main(String args[]) throws InterruptedException 
	{
		
		Triangle triangle = new Triangle();
		triangle.setPosition(new Position(0,0));
	
		Thread thread1 = new Thread(){
			public void run(){
				triangle.moveBy(new Position(10,10));
			}
		};
		
		Thread thread2 = new Thread(){
			public void run(){
				triangle.moveBy(new Position(20,20));
			}
		};
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		System.out.println("New Position : "+triangle.getPosition());
		
	}
}









