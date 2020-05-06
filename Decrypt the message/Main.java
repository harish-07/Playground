#include<iostream>
using namespace std;
int main()
{
  int num1,num2,sum,divisor;
  cin>>num1>>num2;
  sum=num1+num2;
  for(int i=1;i<sum;i++)
  {
    if(sum%i==0)
      divisor=divisor+i;
  }
  if(sum==divisor)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}
  