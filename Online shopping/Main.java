#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int price[2],discount[2],shipping[2],flip,snap,amaz;
  float offer[2];
  for(int i=0;i<=2;i++)
    cin>>price[i]>>discount[i]>>shipping[i];
  offer[0]=(price[0]*float(discount[0])/100);
  offer[1]=(price[1]*float(discount[1])/100);
  offer[2]=(price[2]*float(discount[2])/100);
  flip=price[0]-offer[0]+shipping[0];
  snap=price[1]-offer[1]+shipping[1];
  amaz=price[2]-offer[2]+shipping[2];
  cout<<"In Flipkart Rs."<<flip;
  cout<<"\nIn Snapdeal Rs."<<snap;
  cout<<"\nIn Amazon Rs."<<amaz;
  if(flip<=snap && flip<=amaz)
    cout<<"\nHe will prefer Flipkart";
  else if(snap<amaz)
    cout<<"\nHe will prefer Snapdeal";
  else
    cout<<"\nHe will prefer Amazon";
  
  
}