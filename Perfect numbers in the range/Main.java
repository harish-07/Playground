#include<iostream>
using namespace std;
int main()
{
  int n1,n2,divisor;
  cin>>n1>>n2;
  for(int i=n1;i<n2;i++)
  {
    divisor=0;
    for(int j=1;j<i;j++)
    {
      if(i%j==0)
      {
        divisor=divisor+j;
      }
    }
    if(divisor==i)
      cout<<i<<" ";
  }
}
      