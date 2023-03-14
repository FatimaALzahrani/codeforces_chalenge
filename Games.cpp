//https://codeforces.com/problemset/problem/268/A
#include "bits/stdc++.h"
using namespace std;
int main(){
    int n;
    cin>>n;
    vector<int> ar2;
    int ar1[n];
    for (int i = 0; i < n; ++i) {
        int h,a;
        cin>>h>>a;
        ar1[i]=h;
        ar2.push_back(a);
    }
    int sum=0;
    for (int i = 0; i < n; ++i) {
        sum+=count(ar2.begin(), ar2.end(),ar1[i]);
    }
    cout<<sum;
}