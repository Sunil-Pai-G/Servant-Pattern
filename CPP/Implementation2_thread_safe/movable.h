#ifndef MOVABLE_H
#define MOVABLE_H
#include "position.h"
#include<mutex>
class movable
{
	public:
		virtual movable* set_position(const position& p) = 0;
		virtual position get_position() = 0;
		virtual void move_to(position where) = 0;
		virtual void move_to(int dx, int dy) = 0;
		virtual void move_by(int dx, int dy) = 0;
		virtual void move_by(position where) = 0;
		std::mutex mut;
};
#endif
