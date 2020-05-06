#include<iostream>
using namespace std;
int main()
{
  int n,i=1,start=6;
  cin>>n;
  while(i<=n)
  {
    cout<<start<<" ";
    start=start+5*i;
    i++;
  }
}