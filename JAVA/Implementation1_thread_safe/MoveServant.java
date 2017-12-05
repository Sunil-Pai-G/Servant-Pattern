// Servant class, offering its functionality to classes implementing
// Movable Interface
import java.util.Random;

public class MoveServant {
	// Method, which will move Movable implementing class to position where
	public synchronized void moveTo(Movable serviced, Position where) {
		// Do some other stuff to ensure it moves smoothly and nicely, this is
		// the place to offer the functionality
		serviced.setPosition(where);
	}

	public synchronized void moveTo(Movable serviced, int dx, int dy)  {
		// Do some other stuff to ensure it moves smoothly and nicely, this is
		// the place to offer the functionality
		serviced.setPosition(new Position(dx,dy));
	}	
	

	// Method, which will move Movable implementing class by dx and dy
	public synchronized void moveBy(Movable serviced, int dx, int dy) {
		// this is the place to offer the functionality
		dx += serviced.getPosition().xPosition;
		dy += serviced.getPosition().yPosition;

		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			System.out.println(e);
		}

		serviced.setPosition(new Position(dx, dy));
	}
	
	public synchronized void moveBy(Movable serviced, Position where) {
		// this is the place to offer the functionality
		where.xPosition += serviced.getPosition().xPosition;
		where.yPosition += serviced.getPosition().yPosition;

		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			System.out.println(e);
		}

		serviced.setPosition(new Position(where.xPosition, where.yPosition));
	}
}
