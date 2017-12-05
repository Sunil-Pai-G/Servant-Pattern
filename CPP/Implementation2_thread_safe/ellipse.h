#ifndef ELLIPSE_H
#define ELLIPSE_H

#include "movable.h"
#include "position.h"
#include "move_servant.h"
class ellipse: public movable
{
	public:
		ellipse();
		ellipse(const ellipse& t);
		position get_position() override;
		ellipse* set_position(const position& pos) override;
		void move_to(position where) override;
		void move_to(int dx, int dy) override;
		void move_by(int dx, int dy) override;
		void move_by(position where) override;
	
	private:
		position p;
		move_servant ms;
};
#endif
