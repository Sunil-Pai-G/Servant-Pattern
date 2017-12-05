#ifndef TRIANGLE_H
#define TRIANGLE_H

#include "movable.h"
#include "position.h"

class triangle : public movable
{
	public:
		triangle();
		triangle(const triangle& t);
		position get_position() override;
		triangle* set_position(const position& pos) override;
	
	private:
		position p;
};
#endif
