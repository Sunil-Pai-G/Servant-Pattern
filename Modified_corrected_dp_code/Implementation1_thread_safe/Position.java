// Just a very simple container class for position.
public class Position {
	
	public double xPosition;
	public double yPosition;

	public Position(double dx, double dy) {
		xPosition = dx;
		yPosition = dy;
	}
	
	@Override
	public String toString()
	{
		return "X = "+xPosition+" ; Y = "+yPosition;
		
	}
}