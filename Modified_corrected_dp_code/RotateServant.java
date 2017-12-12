class Angle{

    public double degree;

    public Angle(double angle){
        this.degree = angle;
    }
}
public class RotateServant {
    

	public void rotate(Movable serviced, Angle a) {
        int n = serviced.getNoOfVertices();
        Position vertices[] = serviced.getVertices();
        Position centroid = serviced.getCentroid();
        for(int i=0;i<n;i++){
            vertices[i].xPosition-=centroid.xPosition;
            vertices[i].yPosition-=centroid.yPosition;
            
        }

        double rotateMatrix[][] = new double[][]{{Math.cos(Math.toRadians(a.degree)),-Math.sin(Math.toRadians(a.degree))},{Math.sin(Math.toRadians(a.degree)),Math.cos(Math.toRadians(a.degree))}};

        for(int i = 0;i<n;i++){
            vertices[i].xPosition = vertices[i].xPosition * rotateMatrix[0][0] + vertices[i].yPosition * rotateMatrix[0][1];  
            vertices[i].yPosition = vertices[i].xPosition * rotateMatrix[1][0] + vertices[i].yPosition * rotateMatrix[1][1];          
        }

        for(int i=0;i<n;i++){
            vertices[i].xPosition += centroid.xPosition;
            vertices[i].yPosition += centroid.yPosition;
        }

        serviced.setVertices(vertices);
	}
}