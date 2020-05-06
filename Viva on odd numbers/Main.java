#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,count;
  float score=0.0;
  while(cin>>n)
  {
    if(n%2==0 && n>0)
    {
      score=score-0.5;
    }
    else if(n<0)
    {
        score=score-1.0;
        break;
    }
    else
    {
      score=score+1.0;
      count++;
      if(count==3)
        break;
    }
  }
  cout<<score;
    
}