#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num;
  float time;
  cin>>num>>time;
  if(num==2)
    cout<<time+(time*1/2);
  else if(num==3)
    cout<<time*2;
  else
    cout<<"Number of items is more";
    
}