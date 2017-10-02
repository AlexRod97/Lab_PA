#pragma once
#include "Nodo.h"

class SinglyLinkedList
{
public:
	Nodo *head; 
	Nodo *tail; 
	int size; 

public: 
	SinglyLinkedList();
	~SinglyLinkedList();

	//int size();
	bool isEmpty();
	void addFirst(int e);
	void addLast(int e);
	int first();
	int last();
	int removeFirst();
};

