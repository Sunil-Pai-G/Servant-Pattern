public class ServantClient
{
	
	public static void main(String args[]) throws InterruptedException 
	{

		System.out.println("FOR RECTANGLE");
		Rectangle rectangle = new Rectangle(new Position(1,3),new Position(3,1));
		Position oldCentroid = rectangle.getCentroid();
		System.out.println("Centroid : "+  oldCentroid);
		rectangle.printVertices();

		RotateServant rs = new RotateServant();
		Angle move  = new Angle(180);
		System.out.println("Rotating about : "+move.degree+ " degrees");
		rs.rotate(rectangle,move);

		System.out.println();
		System.out.println("After rotating vertices are:");
		rectangle.printVertices();
		System.out.println("Centroid : "+  rectangle.getCentroid());

		MoveServant ms = new MoveServant();
		Position delta = new Position(10,10);
		System.out.println();
		System.out.println("Moving Centroid by :"+delta + " degrees");
		ms.moveBy(rectangle,delta);

		System.out.println("After moving vertices are:");
		rectangle.printVertices();
		System.out.println("Centroid : "+  rectangle.getCentroid());
		
		System.out.println();
		System.out.println("Resetting to the old position "+ oldCentroid);
		ms.moveTo(rectangle,oldCentroid);

		System.out.println("After moving vertices are:");
		rectangle.printVertices();
		System.out.println("Centroid : "+  rectangle.getCentroid());



		
		// System.out.println("FOR TRIANGLE");
		// Triangle triangle = new Triangle(new Position(0,0),new Position(4,0),new Position(2,3));
		// System.out.println("Centroid : "+  triangle.getCentroid());
		// triangle.printVertices();

		// rs.rotate(triangle,new Angle(210));

		// triangle.printVertices();
		
		// System.out.println("Centroid : "+  triangle.getCentroid());
	}

	
}









