#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int principal,rate,years;
  float intrest,amount,discount,finalamount;
  cin>>principal>>rate>>years;
  intrest=principal*rate*years/100;
  amount=principal+intrest;
  discount=2*intrest/100;
  finalamount=amount-discount;
  cout<<intrest<<"\n"<<amount<<"\n"<<discount<<"\n"<<finalamount;

}