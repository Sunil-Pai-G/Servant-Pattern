#ifndef TRIANGLE_H
#define TRIANGLE_H

#include "movable.h"
#include "position.h"
#include "move_servant.h"
class triangle : public movable
{
	public:
		triangle();
		triangle(const triangle& t);
		position get_position() override;
		triangle* set_position(const position& pos) override;
		void move_to(position where) override;
		void move_to(int dx, int dy) override;
		void move_by(int dx, int dy) override;
		void move_by(position where) override;
	
	private:
		position p;
		move_servant ms;
};
#endif
