#ifndef MOVE_SERVANT
#define MOVE_SERVANT

#include "movable.h"
#include "position.h"
#include <thread>
#include<mutex>
class move_servant
{
	public :
		move_servant()=default;
		move_servant(const move_servant& ms)=default;
		void move_to(movable* serviced, position where);
		void move_to(movable* serviced, int dx, int dy);
		void move_by(movable* serviced, int dx, int dy);
		void move_by(movable* serviced, position where);
	private:
		std::mutex mut;
};


#endif
