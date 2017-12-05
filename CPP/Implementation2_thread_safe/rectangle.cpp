#include "rectangle.h"
rectangle::rectangle()
{}
rectangle::rectangle(const rectangle& t)
{
	p = t.p;
}

position rectangle::get_position() 
{
	return p;
}
rectangle* rectangle::set_position(const position& pos)
{
	p =pos;
	return this;
}
void rectangle::move_to(position where)
{
	ms.move_to(this,where);
}
void rectangle::move_to(int dx, int dy)
{

	ms.move_to(this,dx,dy);
}
void rectangle::move_by(int dx, int dy)
{
	ms.move_by(this,dx,dy);
}	
void rectangle::move_by(position where)
{	
	ms.move_by(this,where);
}
