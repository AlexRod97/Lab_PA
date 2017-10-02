#include "stdafx.h"
#include "SinglyLinkedList.h"
#include <stdio.h>

SinglyLinkedList::SinglyLinkedList()
{
	head = NULL; 
	tail = NULL; 
	//size = 0; 
}

SinglyLinkedList::~SinglyLinkedList()
{
}



bool SinglyLinkedList::isEmpty()
{
	return ((head == NULL) && (tail == NULL));
}

void SinglyLinkedList::addFirst(int e)
{
	Nodo *newData = new Nodo(e,NULL); 

	if (isEmpty())
	{
		head = newData; 
		tail = newData;
		//size = size + 1;
	}	
}

void SinglyLinkedList::addLast(int e)
{
	Nodo *newData = new Nodo(e,NULL); 

	if (isEmpty())
		head = newData;
	else
	{
		tail->next = newData; 
		tail = newData; 
		//size++;
	}
}

int SinglyLinkedList::first()
{
	if (isEmpty())
		return NULL;
	return head->getPropiedad(); 
}

int SinglyLinkedList::last()
{
	if (isEmpty())
		return NULL;
	return tail->getPropiedad(); 
}

int SinglyLinkedList::removeFirst()
{
	if (isEmpty())
		return NULL; 
	int res = head->getPropiedad();
	head = head->next; 
	//size--;

	if (size == 0)	
		tail = NULL; 
		return res; 	
}
