#include "triangle.h"

triangle::triangle()
{}

triangle::triangle(const triangle& t)
{
	p = t.p;
}

position triangle::get_position()
{
	return p;
}
triangle* triangle::set_position(const position& pos)
{
	p =pos;
	return this;
}
void triangle::move_to(position where)
{
	ms.move_to(this,where);
}
void triangle::move_to(int dx, int dy)
{

	ms.move_to(this,dx,dy);
}
void triangle::move_by(int dx, int dy)
{
	ms.move_by(this,dx,dy);
}	
void triangle::move_by(position where)
{	
	ms.move_by(this,where);
}
