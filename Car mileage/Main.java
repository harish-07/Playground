#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mileage;
  int available,distance;
  cin>>mileage>>available>>distance;
  if(mileage*available>=distance)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}