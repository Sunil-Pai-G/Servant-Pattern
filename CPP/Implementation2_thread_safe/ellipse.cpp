#include "ellipse.h"
ellipse::ellipse()
{}
ellipse::ellipse(const ellipse& t)
{
	p = t.p;
}

position ellipse::get_position() 
{
	return p;
}
ellipse* ellipse::set_position(const position& pos)
{
	p =pos;
	return this;
}

void ellipse::move_to(position where)
{
	ms.move_to(this,where);
}
void ellipse::move_to(int dx, int dy)
{

	ms.move_to(this,dx,dy);
}
void ellipse::move_by(int dx, int dy)
{
	ms.move_by(this,dx,dy);
}	
void ellipse::move_by(position where)
{	
	ms.move_by(this,where);
}
