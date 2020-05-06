#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,w; /*w is the number of copies sold,
  x is the cost per copy and y is the cost the agency spends per copy.*/
  cin>>w>>x>>y;
  cout<<w*x-w*y-100;
}
