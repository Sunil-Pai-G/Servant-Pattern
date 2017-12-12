public class Circle implements Movable {
	private Position centroid;
	float radius;
    public int getNoOfVertices(){
		return 0;
    }
    
	public Circle setCentroid(Position p) {
		this.centroid = p;
		return this;
	}

	// Method, which returns position of geometric object
	public Position getCentroid() {
		return this.centroid;
	}

	public Circle(Position p1,float r){
        this.centroid = p1;
        this.radius = r;
    }
    
    public void printVertices(){
		// for(int i=0;i<vertices.length;i++){
			System.out.println("Centroid:"+ centroid );
		// }
	}


	public Position[] getVertices()
	{

		 return new Position[]{centroid};
	}
	public void setVertices(Position[] positions)
	{
			
	}
}