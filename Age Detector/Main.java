#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int birth,current;
  cin>>birth>>current;
  if(current<birth)
  cout<<(current+100)-birth;
  else
    cout<<current-birth;
  
}