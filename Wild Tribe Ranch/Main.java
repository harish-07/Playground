#include<iostream>
using namespace std;
int main()
{
  int max,florence;
  cin>>max>>florence;
  if(florence<max)
    cout<<"Yes, you can enter.";
  else if(florence==max)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else
    cout<<"Sorry, you can't enter";
}