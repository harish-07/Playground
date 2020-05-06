#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,t1=0,t2=1,nt;
  cin>>n;
    if(n==1)
      cout<<t1;
    else if(n==2)
      cout<<t1;
    else
    {  
    for(int i=3;i<=n;i++)
      {
        nt=t1+t2;
        t1=t2;
        t2=nt;
      }
      cout<<nt;
    } 
}