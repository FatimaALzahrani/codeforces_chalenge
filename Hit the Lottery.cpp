// https://codeforces.com/problemset/problem/996/A
#include "bits/stdc++.h"
using namespace std;
int main(){
    long long n;
    cin>>n;
    int re=0;
    if(n>=100) {
        re += n / 100;
        n = n % 100;
    }
    if(n>=20) {
        re += n/20;
        n=n%20;
    }
    if(n>=10) {
        re += n/10;
        n=n%10;
    }
    if(n>=5) {
        re += n/5;
        n=n%5;
    }
    re+=n;
    cout<<re;
}