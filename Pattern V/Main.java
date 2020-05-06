#include<iostream>
using namespace std;
int main()
{
  int n,lterm=1,rterm;
  cin>>n;
  rterm=n*n+1;
  for(int i=n;i>0;i--)
  {
    for(int space=n;space>i;space--)
       cout<<"--";
    for(int j=1;j<=i;j++)
    {
       cout<<lterm<<"*";
      lterm++;
    }
    for(int j=1;j<i;j++)
    {
      cout<<rterm<<"*";
      rterm++;
    }
    cout<<rterm;
    cout<<endl;
    rterm=rterm-(i-1)*2;
  }
}