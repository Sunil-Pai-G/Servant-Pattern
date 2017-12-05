// Interface specifying what serviced classes needs to implement, to be
// serviced by servant.
public interface Movable {
	public void setPosition(Position p);
	public Position getPosition();
}