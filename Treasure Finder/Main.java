#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
 int num1,num2,num3,divisor,maximum,treasure,i;
 cin>>num1>>num2>>num3;
 if((num1>num2) && (num1>num3))
 {
   maximum=num1;
   num2>num3?treasure=num2:treasure=num3;
 }
  else if(num2>num3)
  {
    maximum=num2;
    num1>num3?treasure=num1:treasure=num3;
  }
  else
  {
    maximum=num3;
    num2>num1?treasure=num2:treasure=num1;
  } 
  maximum=(num1<num2)?(num1<num3?num1:num3):(num2<num3?num2:num3);
  for(i=maximum;i>=1;i--)
  {
    if( (num1%i==0) && (num2%i==0) && (num3%i==0))
    {
      divisor=i;
      break;
    }
  }
    
cout<<"The treasure is in box which has number "<<treasure;
cout<<"\nThe code to open the box is "<<divisor;
}
