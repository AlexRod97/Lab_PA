#pragma once
class Nodo
{
public:
	Nodo *next;	
	int propiedad;
	
	Nodo(int propiedad, Nodo *n);
	int getPropiedad();
	~Nodo();
};

