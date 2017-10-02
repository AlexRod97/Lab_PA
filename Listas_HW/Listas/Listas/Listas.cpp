// Listas.cpp : main project file.

#include "stdafx.h"
#include "SinglyLinkedList.h"
#include <stdio.h>
#include "Nodo.h"
#include <string.h>
using namespace System;
using namespace System::Runtime::InteropServices;


int main(array<System::String ^> ^args)
{
	SinglyLinkedList *lista = new SinglyLinkedList(); 
	Nodo *ptr = lista->head; 

	lista->addFirst(1);
	lista->addLast(2); 
	lista->addLast(3); 
	lista->addLast(4); 

	int valor = lista->removeFirst();	
		
	while (lista->head != NULL)
	{		
		Console::WriteLine(lista->first());
		valor = lista->removeFirst();
	}  
	Console::ReadKey(); 
	return 0; 
}
