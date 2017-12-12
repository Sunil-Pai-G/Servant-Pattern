// Servant class, offering its functionality to classes implementing
// Movable Interface
import java.util.Random;

public class MoveServant {
	 //Method, which will move Movable implementing class to position where
	public void moveTo(Movable serviced, Position where) {
		// Do some other stuff to ensure it moves smoothly and nicely, this is
		// the place to offer the functionality
		serviced.setCentroid(where);
	}

	public void moveTo(Movable serviced, int dx, int dy)  {
		// Do some other stuff to ensure it moves smoothly and nicely, this is
		// the place to offer the functionality
		serviced.setCentroid(new Position(dx,dy));
	}	
	

	// Method, which will move Movable implementing class by dx and dy
	public void moveBy(Movable serviced, int dx, int dy) {
		// this is the place to offer the functionality
			dx += serviced.getCentroid().xPosition;
			dy += serviced.getCentroid().yPosition;
			serviced.setCentroid(new Position(dx, dy));
	}
	
	public  void moveBy(Movable serviced, Position where) {

			// this is the place to offer the functionality
			where.xPosition += serviced.getCentroid().xPosition;
			where.yPosition += serviced.getCentroid().yPosition;
			serviced.setCentroid(new Position(where.xPosition, where.yPosition));

	}
}