#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int length,radius;
  cin>>radius>>length;
  if(2*radius<=length)
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
  
}