 #include<iostream>
#include<math.h>
using namespace std;
int main()
{
  // Type your code here
  int n,count;
  cin>>n;
count = (n== 0) ? 1  : (log10(n) + 1);
  
  cout<<count;
}
