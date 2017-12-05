#ifndef POSITION_H
#define POSITION_H
#include <iostream>
struct position
{
	position();
	position(int x,int y);
	position(const position& p);
	friend std::ostream& operator<<(std::ostream& o,const position& p);
	int x_position;
	int y_position;
};
#endif