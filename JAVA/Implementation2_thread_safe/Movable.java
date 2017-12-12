public interface Movable {
	public void setPosition(Position p);
	public Position getPosition();
	public void moveTo(int dx, int dy);
	public void moveTo(Position p);
	public void moveBy(Position where);
	public void moveBy(int dx, int dy);
}