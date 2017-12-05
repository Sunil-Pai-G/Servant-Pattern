#ifndef RECTANGLE_H
#define RECTANGLE_H

#include "movable.h"
#include "position.h"
#include "move_servant.h"
class rectangle: public movable
{
	public:
		rectangle();
		rectangle(const rectangle& t);
		position get_position() override;
		rectangle* set_position(const position& pos) override;
		void move_to(position where) override;
		void move_to(int dx, int dy) override;
		void move_by(int dx, int dy) override;
		void move_by(position where) override;
	
	private:
		position p;
		move_servant ms;
};
#endif
