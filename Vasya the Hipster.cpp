#include "bits/stdc++.h"
//https://codeforces.com/problemset/problem/581/A
using namespace std;
int main() {
int a,b;
cin>>a>>b;
int m=min(a,b);
int aa=a-m;
int bb=b-m;
int tow=(bb/2)+(aa/2);
cout<<m<<" "<<tow;
}