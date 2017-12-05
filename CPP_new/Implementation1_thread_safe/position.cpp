#include "position.h"
position::position()
{}
position::position(int x,int y)
:x_position(x),y_position(y)
{}

position::position(const position& p)
{
	x_position = p.x_position;
	y_position = p.y_position;
}

std::ostream& operator<<(std::ostream& o,const position& p)
{
	return (o << "X = " << p.x_position << " ; Y = " << p.y_position);
}