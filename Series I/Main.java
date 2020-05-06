#include<iostream>
using namespace std;
int main()
{
  float n,sum=0.5;
  cin>>n;
  if(n==1)
    cout<<sum;
  else
  {
  for(int i=1;i<=n;i++)
  {
    cout<<sum<<" ";
    sum=sum*3.0;
  }
  }
}