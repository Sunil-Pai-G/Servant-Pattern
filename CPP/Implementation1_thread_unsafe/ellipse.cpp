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
