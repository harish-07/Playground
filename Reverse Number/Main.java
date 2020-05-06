#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int n,sum,rev;
  cin>>n;
  int temp=n;
  while(n!=0)
  {
    rev=rev*10;
    rev=rev+(n%10);
    n=n/10;
  }
  cout<<rev;
    
  
  
	return 0;
}