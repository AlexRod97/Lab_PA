// Simple Hello World
 
#include <iostream>

int sumar(int, int); 
int restar(int,int); 
int multiplicar(int,int); 
int dividir(int,int);
void sumaPunteros(int, int, int*); 
void restaPunteros(int, int, int*); 
void multiplicarPunteros(int, int, int*); 
void dividirPunteros(int, int, int*); 

int main()
{
    int resultadoS = sumar(8,5); 
    int resultadoR = restar(8,5); 
    int resultadoM = multiplicar(8,5); 
    int resultadoD = dividir(8,5);     
    
  std::cout << "my phrase" << std::endl;
  
  std::cout << resultadoS << std::endl; 
  std::cout << resultadoR << std::endl; 
  std::cout << resultadoM << std::endl; 
  std::cout << resultadoD << std::endl; 
  std::cout << "_________________" << std::endl;
  
    int resultado = -1; 
    
    sumaPunteros(8,5, &resultado); 
    std::cout << "Resultado es " << resultado << std::endl; 
    restaPunteros(8,5, &resultado);     
    std::cout << "Resultado es " << resultado << std::endl; 
    multiplicarPunteros(8,5, &resultado); 
    std::cout << "Resultado es " << resultado << std::endl; 
    dividirPunteros(8,5, &resultado); 
    std::cout << "Resultado es " << resultado << std::endl; 
  
  return 0;
}

int sumar (int a, int b) 
{
   return a+b; 
}

int restar(int a, int b) 
{
    return a-b; 
}

int multiplicar(int a, int b) 
{
    return a*b; 
}

int dividir (int a, int b) 
{
    return a/b; 
}
 
void sumaPunteros(int a, int b, int*resultado) 
{
    *resultado = a+b; 
}

void restaPunteros(int a, int b, int*resultado)
{
    *resultado = a-b; 
}

void multiplicarPunteros(int a, int b, int*resultado) 
{
    *resultado = a*b; 
}

void dividirPunteros(int a, int b, int*resultado)
{
    *resultado = a/b; 
}