#include<iostream>
#include<math.h>
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
   int temp=n,digit,sum;
    int len=log10(n)+1;
  while(n>0)
  {
    digit=power(n%10,len);
    n=n/10;
    sum=sum+digit;
  }
  if(sum==temp)
    return 1;
  else
    return 0;
    
      
}
int main()
{
    int n;
    cin>>n;
    if(arm(n)==1)
        cout<<"Kindly proceed with encrypting";
    else
       cout<<"It is not an Armstrong number";
    
}