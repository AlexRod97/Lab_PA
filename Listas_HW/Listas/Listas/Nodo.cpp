#include "stdafx.h"
#include "Nodo.h"
#include <stdio.h>


Nodo::Nodo(int e, Nodo *n)
{
	this->next = n; 
	this->propiedad = e;

}

Nodo::~Nodo()
{
}

int Nodo::getPropiedad()
{
	return propiedad;
}