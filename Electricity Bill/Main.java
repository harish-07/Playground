#include<iostream>
using namespace std;
int main()
{
  //Type your code here.'
  int unit, bill;
  cin>>unit;
  if(unit<=200)
    bill=0.5*unit;
  else if(unit>=200 && unit<=400)
    bill=0.65*unit+100;
  else if(unit<=600)
    bill=0.8*unit+200;
  else
    bill=1.25*bill+425;
  cout<<"Rs."<<bill;

  
}