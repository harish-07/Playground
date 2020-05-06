#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int m,n,req,x;
  cin>>m>>n>>req;
  x=pow(m,n);
  if(x<req)
     cout<<"Sorry Doctor! You need more bacteria.";
  else
    cout<<"Doctor, you can proceed with your experiment.";
}
    
  
  
  