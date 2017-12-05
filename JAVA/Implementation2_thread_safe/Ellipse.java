// One of geometric classes
public class Ellipse implements Movable {
	// Position of the geometric object on some canvas
	private Position p;
	private MoveServant m;
	
	public Ellipse()
	{
		m = new MoveServant();
	}
	
	// Method, which sets position of geometric object
	public void setPosition(Position p) {
		this.p = p;
	}

	// Method, which returns position of geometric object
	public Position getPosition() {
		return this.p;
	}
	
	public void moveTo(int dx, int dy)
	{
		m.moveTo(this,dx,dy);
	}
	public void moveTo(Position p)
	{
		m.moveTo(this,p);
	}
	public void moveBy(Position where)
	{
		m.moveBy(this,where);
	}
	public void moveBy(int dx, int dy)
	{
		m.moveBy(this,dx,dy);
	}
}