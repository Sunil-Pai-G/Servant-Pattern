// Interface specifying what serviced classes needs to implement, to be
// serviced by servant.
public interface Movable {
	public Movable setCentroid(Position p);
	public Position getCentroid();
	public int getNoOfVertices();
	public Position[] getVertices();
	public void setVertices(Position[] positions);
}