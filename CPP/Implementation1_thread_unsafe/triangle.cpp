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
