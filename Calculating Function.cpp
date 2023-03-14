//https://codeforces.com/problemset/problem/486/A
#include <iostream>
#include <set>
using namespace std;
int main(){
    long long a;
    cin>>a;
    cout<<(a%2==0?(a/2):(a/2-a));

    return 0;
}