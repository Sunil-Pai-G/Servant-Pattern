// One of geometric classes
public class Rectangle implements Movable {
	// Position of the geometric object on some canvas
	private Position centroid;
	public Position vertices[] = new Position[4];

	public int getNoOfVertices(){
		return this.vertices.length;
	}
	
	public Position[] getVertices(){
		return vertices;
	}
	public void setVertices(Position[] positions){
		for(int i=0;i< vertices.length;i++)
			this.vertices[i]= positions[i];
		this.centroid = calculateCentroid(vertices);
	}
	// Method, which sets position of geometric object
	public Rectangle setCentroid(Position p) {
		
		for(int i=0;i<vertices.length;i++){
			vertices[i].xPosition+=p.xPosition - centroid.xPosition;
			vertices[i].yPosition+=p.yPosition - centroid.yPosition;			
		}

		this.centroid = p;
		return this;
	}


	// Method, which returns position of geometric object
	public Position getCentroid() {
		return this.centroid;
	}

	public Rectangle(Position p1,Position p2,Position p3,Position p4){
		vertices[0] = p1;
		vertices[1] = p2;
		vertices[2] = p3;
		vertices[3] = p4;

		centroid = calculateCentroid(vertices);
		
	}

	public Rectangle(Position leftTopCorner,Position rightBottomCorner){
		vertices[0] = leftTopCorner;
		vertices[1] = new Position(rightBottomCorner.xPosition,leftTopCorner.yPosition);
		vertices[2] = rightBottomCorner;
		vertices[3] = new Position(leftTopCorner.xPosition,rightBottomCorner.yPosition);;

		centroid = calculateCentroid(vertices);
		
	}


	private Position calculateCentroid(Position p[])
	{
		return  new Position((p[0].xPosition+p[2].xPosition)/2,(p[0].yPosition+p[2].yPosition)/2);
		
	}

	public void printVertices(){
		for(int i=0;i<vertices.length;i++){
			System.out.println("Vertex "+ i+": "+ vertices[i] );
		}
	}
}