//https://codeforces.com/problemset/problem/750/A
#include "bits/stdc++.h"
using namespace std;
int main() {
int n,k;
cin>>n>>k;
int sum=0;
int t=5;
int tt=5;
    while (n--){
        if(tt+k<=240) {
            sum++;
            t += 5;
            tt+=t;
        }else
            break;
    }
    cout<<sum;
}