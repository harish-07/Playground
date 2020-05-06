#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int row,column,number;
  cin>>row>>column>>number;
  if((number==column+1) || (number==column*2) || (number==((row-1)*column)) || (number==((row-2)*column+1)))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
    
}