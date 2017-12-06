public class ServantClient
{	
	public static void main(String args[])
	{
		
		Triangle triangle = new Triangle();
		Ellipse ellipse = new Ellipse();
		MoveServant moveservant = new MoveServant();
	
		moveservant.moveTo(triangle,new Position(10,10));
		
		System.out.println("New Position : "+triangle.getPosition());
		
	}
}









