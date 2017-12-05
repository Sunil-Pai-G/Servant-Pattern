#ifndef RECTANGLE_H
#define RECTANGLE_H

#include "movable.h"
#include "position.h"

class rectangle: public movable
{
	public:
		rectangle();
		rectangle(const rectangle& t);
		position get_position() override;
		rectangle* set_position(const position& pos) override;
	
	private:
		position p;
};
#endif
