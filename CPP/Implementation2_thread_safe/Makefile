CFLAGS  = -g -Wall -std=c++17 -pthread
COMP = g++-7
a.out : client.o move_servant.o triangle.o rectangle.o ellipse.o position.o
	$(COMP) client.o move_servant.o triangle.o rectangle.o ellipse.o position.o -lpthread
	
client.o: move_servant.o triangle.o rectangle.o ellipse.o position.o
	$(COMP) client.cpp -c $(CFLAGS)
	
move_servant.o: move_servant.cpp position.o movable.h
	$(COMP) move_servant.cpp -c $(CFLAGS)

rectangle.o: rectangle.cpp position.o movable.h
	$(COMP) rectangle.cpp -c $(CFLAGS)

ellipse.o: ellipse.cpp position.o movable.h
	$(COMP) ellipse.cpp -c $(CFLAGS)
	
triangle.o: triangle.cpp position.o movable.h
	$(COMP) triangle.cpp -c $(CFLAGS)

position.o: position.cpp position.h movable.h
	$(COMP) position.cpp -c $(CFLAGS)

clean: 
	rm -rf *.o a.out
