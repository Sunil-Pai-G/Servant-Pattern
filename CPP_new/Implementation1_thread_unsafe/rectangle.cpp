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
