import java.util.Random;

public class MoveServant {
	
	public void moveTo(Movable serviced, Position where) {
		serviced.setPosition(where);
	}

	public void moveTo(Movable serviced, int dx, int dy)  {
		serviced.setPosition(new Position(dx,dy));
	}	
	

	public void moveBy(Movable serviced, int dx, int dy) {
		
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
	
	public void moveBy(Movable serviced, Position where) {

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