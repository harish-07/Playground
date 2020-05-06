#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int n,parts,sum,sq;
  cin>>n;
  sq=n*n;
  int len=log10(sq)+1;
  for(int i=1;i<len;i++)
  {
    parts=pow(10,i);
    if(parts==n)
    {
      cout<<"Not a Kaprekar Number";
      break;
    }
    else
    {
      sum=(sq/parts)+(sq%parts);
      if(sum==n)
      {
       cout<<"Kaprekar Number";
       break;}
    }
  }
  if(sum!=n)
    cout<<"Not a Kaprekar Number";
  
}
  
