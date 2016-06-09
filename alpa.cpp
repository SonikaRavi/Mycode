#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	char n;
	cin>>n;
	if(('A'<=n&&n<='Z')||('a'<=n&&n<='z'))
	{
		cout<<"alphabet";
	}
	else
	{
		cout<<"number";
	}
	return 0;
}
