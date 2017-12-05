#include "move_servant.h"
void move_servant::move_to(movable* serviced, position where)
{			
	serviced->set_position(where);
}
void move_servant::move_to(movable* serviced, int dx, int dy)
{
	serviced->set_position(position(dx,dy));
}
void move_servant::move_by(movable* serviced, int dx, int dy)
{
	dx += serviced->get_position().x_position;
	dy += serviced->get_position().y_position;
	std::this_thread::sleep_for(std::chrono::seconds{2});
	serviced->set_position(position(dx, dy));
	//std::cout << serviced->get_position() << '\n';
}
void move_servant::move_by(movable* serviced, position where)
{
	where.x_position += serviced->get_position().x_position;
	where.y_position += serviced->get_position().y_position;
	
	//std::cout << where.x_position << ": " << where.y_position << '\n';
	std::this_thread::sleep_for(std::chrono::seconds{2});
	serviced->set_position(position(where.x_position, where.y_position));
	
	//std::cout << serviced->get_position() << '\n';
}
