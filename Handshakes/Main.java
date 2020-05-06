#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    for(int j=i;j<n;j++)
      sum=sum+1;
  }
  cout<<sum;
      
  
}