#include<iostream>
using namespace std;
int gcd(int m1,int m2,int m3)
{
  int min,gcd,i=2;
  if(m1<m2 && m1<m3)
    min=m1;
  else if(m2<m3)
    min=m2;
  else
    min=m3;
  i=min;
  while(i>=1)
  {
    if((m1%i)==0 && (m2%i)==0 && (m3%i)==0)
    {
      return i;break;
    }
    if(i==min)
      return 1;
    i--;
  }
}

  
      
int main()
{
 int n1,n2,n3,g,n4;
 cin>>n1>>n2>>n3>>n4;
  g=gcd(n1,n2,n3);
 if(g==n4)
   cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}
 
 
