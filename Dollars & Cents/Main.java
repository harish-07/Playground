#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int dollar1,dollar2,cent1,cent2,sd,sc;
  cin>>dollar1>>cent1>>dollar2>>cent2;
  sd=(dollar1+dollar2)+((cent1+cent2)/100);
  sc=(cent1+cent2)%100;
  cout<<sd<<"\n"<<sc;
  
 
  
  
}