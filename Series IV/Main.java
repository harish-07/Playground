#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int n,start=0;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
     if(i%2==0)
     {
       start=pow(i,2)-2;
       cout<<start<<" ";
     }
    else
    {
      start=pow(i,2)-1;
      cout<<start<<" ";
    }
  }
}
    
