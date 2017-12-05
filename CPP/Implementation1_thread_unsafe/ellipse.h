#ifndef ELLIPSE_H
#define ELLIPSE_H

#include "movable.h"
#include "position.h"

class ellipse: public movable
{
	public:
		ellipse();
		ellipse(const ellipse& t);
		position get_position() override;
		ellipse* set_position(const position& pos) override;
	
	private:
		position p;
};
#endif
