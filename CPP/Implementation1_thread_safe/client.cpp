#include <iostream>
#include "move_servant.h"
#include "triangle.h"
#include <thread>

int main()
{
	triangle t1;
	t1.set_position({0,0});
	move_servant ms1;
	move_servant ms2;
	//ms.moveBy(&t1,position(10,10));
	//ms.moveBy(&t1,position(20,20));
	
	//std::cout << "New Position : " << t1.get_position() << "\n";
	
	std::thread th1([&](){ms1.move_by(&t1,position(10,10));});
    	std::thread th2([&](){ms2.move_by(&t1,position(20,20));});
 
 
   	th1.join();
    	th2.join();
	
	std::cout << "New Position : " << t1.get_position() << "\n";
	
}
