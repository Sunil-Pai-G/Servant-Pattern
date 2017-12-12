public class Triangle implements Movable {
	
	private Position p;
	private MoveServant m;
	public Triangle()
	{
		m = new MoveServant();
	}
        
	public void setPosition(Position p) {
		this.p = p;
	}

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