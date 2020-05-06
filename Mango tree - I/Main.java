#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int row,column,num;
  cin>>row>>column>>num;
  if( (num<=column) || (num%column==1) || (num%column==0))
    cout<<"Yes";
  else
    cout<<"No";
}