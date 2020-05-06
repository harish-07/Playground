#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float time,matnee=13.30;
  cin>>age>>time;
  if(age>13)
    if(time==matnee)
      cout<<"$5.00";
    else
      cout<<"$8.00";
  else
    if(time==matnee)
      cout<<"$2.00";
    else
      cout<<"$4.00";
  
}