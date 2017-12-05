#ifndef MOVABLE_H
#define MOVABLE_H
#include "position.h"
class movable
{
	public:
		virtual movable* set_position(const position& p) =0;
		virtual position get_position()= 0;
};
#endif
