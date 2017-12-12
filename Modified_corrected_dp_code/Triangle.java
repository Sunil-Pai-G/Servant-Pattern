// One of geometric classes
public class Triangle implements Movable {
	// Position of the geometric object on some canvas
	private Position centroid;
	public Position vertices[] = new Position[3];

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
	public Triangle setCentroid(Position p) {
		
		for(int i=0;i<vertices.length;i++){
			vertices[i].xPosition+=p.xPosition;
			vertices[i].yPosition+=p.yPosition;			
		}

		this.centroid = p;
		return this;
	}


	// Method, which returns position of geometric object
	public Position getCentroid() {
		return this.centroid;
	}

	public Triangle(Position p1,Position p2,Position p3){
		vertices[0] = p1;
		vertices[1] = p2;
		vertices[2] = p3;

		centroid = calculateCentroid(vertices);
		
	}


	private Position calculateCentroid(Position p[])
	{
		return  new Position((p[0].xPosition+p[1].xPosition+p[2].xPosition)/3,(p[0].yPosition+p[1].yPosition+p[2].yPosition)/3);
		
	}

	public void printVertices(){
		for(int i=0;i<vertices.length;i++){
			System.out.println("Vertex "+ i+": "+ vertices[i] );
		}
	}
}

